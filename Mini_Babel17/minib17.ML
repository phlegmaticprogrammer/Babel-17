datatype value =
  VBool of bool
| VInt of int
| VFun of value -> value
| VList of value list

datatype block =
  Block of statement list
and statement =
  SVal of identifier * expression
| SAssign of identifier * expression
| SYield of expression
| SIf of simple_expression * block * block
| SWhile of simple_expression * block
| SFor of identifier * simple_expression * block
| SBlock of block
and expression =
  ESimple of simple_expression
| EBlock of statement
and simple_expression =
  EInt of int
| EBool of bool
| EId of identifier
| EFun of identifier * expression
| EBinOp of (value * value -> value) * expression * expression
and identifier =
  Id of string

exception Illformed
exception TypeError

type 'a idmap = (string*'a) list

type environment = value idmap * (value ref) idmap

fun lookup [] _ = raise Illformed
  | lookup ((t, x)::r) (Id s) = if t = s then x else lookup r (Id s)

fun remove [] _ = []
  | remove ((t,x)::r) (Id s) = if t = s then r else (t,x)::(remove r (Id s))

fun insert m ((Id s),x) = (s,x)::(remove m (Id s))

fun deref [] = [] 
  | deref ((s, vr)::m) = ((s,!vr)::(deref m))

fun freeze (nonlinear, linear) = (nonlinear@(deref linear), [])

fun bind (nonlinear, linear) (id,value) =
  (remove nonlinear id, insert linear (id, ref value))

fun rebind (env as (_, linear)) (id, value) =
  (lookup linear id := value; env)

fun eval_b env (Block []) = (env, [])
  | eval_b env (Block (s::r)) =
    let
      val (env', values_s) = eval_st env s
      val (env'', values_r) = eval_b env' (Block r)
    in
      (env'', values_s @ values_r)
    end
and eval_nestedb env b =
  	let
  		val (_, values) = eval_b env b
  	in
  		(env, values)		
  	end
and eval_st env (SVal (id, e)) =
    let
      val value = eval_e env e
    in
      (bind env (id, value), [])
    end
  | eval_st env (SAssign (id, e)) =
    let
      val value = eval_e env e
    in
      (rebind env (id, value), [])
    end
  | eval_st env (SYield e) =
    let
      val value = eval_e env e
    in
      (env, [value])
    end
  | eval_st env (SBlock b) = eval_nestedb env b
  | eval_st env (SIf (cond, yes, no)) =
      (case eval_se env cond of
        VBool true => eval_nestedb env yes
      | VBool false => eval_nestedb env no
      | _ => raise TypeError)
  | eval_st env (loop as SWhile (cond, body)) =
      (case eval_se env cond of
        VBool true =>
          let
            val (_, values_1) = eval_b env body
            val (_, values_2) = eval_st env loop
          in
            (env, values_1 @ values_2)
          end
      | VBool false =>
          (env, [])
      | _ => raise TypeError)
  | eval_st env (SFor (id, list, body)) =
      (case eval_se env list of
         VList L => eval_for env id body L
       | _ => raise TypeError)
and eval_for env id body [] = (env, [])
  | eval_for env id body (x::xs) =
    let
      val (_, values_1) = eval_b (bind env (id,x)) body
      val (_, values_2) = eval_for env id body xs
    in
      (env, values_1@values_2)
    end
and eval_e env (ESimple se) = eval_se env se
  | eval_e env (EBlock s) =
      (case eval_b env (Block [s]) of
         (_, [a]) => a
       | (_, L) => VList L)
and eval_se env se = eval_simple (freeze env) se
and eval_simple env (EInt i) = VInt i
  | eval_simple env (EBool b) = VBool b
  | eval_simple env (EBinOp (f, a, b)) =
      f (eval_e env a, eval_e env b)
  | eval_simple (nonlinear, _) (EId id) = 
      lookup nonlinear id
  | eval_simple env (EFun (id, body)) =
      VFun (fn value =>
              eval_e (bind env (id, value)) body)

fun eval prog = eval_e ([], []) (EBlock (SBlock prog))
fun evalExpr e = eval_e ([], []) e

val VALUE = VInt 0

fun check_b env (Block []) = env
  | check_b env (Block (s::r)) = 
    	check_b (check_st env s) (Block r)    
and check_st env (SVal (id, e)) =
      (check_e env e; bind env (id, VALUE))
  | check_st env (SAssign (id, e)) =
  	  (check_e env e; rebind env (id, VALUE))
  | check_st env (SYield e) = (check_e env e; env)
  | check_st env (SBlock b) = (check_b env b; env)
  | check_st env (SIf (cond, yes, no)) =
      (check_se env cond; 
       check_b env yes; check_b env no; env)
  | check_st env (loop as SWhile (cond, body)) =
      (check_se env cond; check_b env body; env)
  | check_st env (SFor (id, list, body)) =
      (check_se env list; 
       check_b (bind env (id, VALUE)) body; env)
and check_e env (ESimple se) = check_se env se
  | check_e env (EBlock s) = 
  	  (check_b env (Block [s]); ()) 
and check_se env se = check_simple (freeze env) se
and check_simple env (EInt i) = ()
  | check_simple env (EBool b) = ()
  | check_simple env (EBinOp (f, a, b)) =
      (check_e env a; check_e env b)
  | check_simple (nonlinear, _) (EId id) = 
      (lookup nonlinear id; ())
  | check_simple env (EFun (id, body)) =
  	  check_e (bind env (id, VALUE)) body
  	  
fun check prog = check_e ([], []) (EBlock (SBlock prog))
fun checkExpr e = check_e ([], []) e  	  


(************
   Examples
 ************)

fun exprInt i = ESimple (EInt i)
fun exprId s = ESimple (EId (Id s))
fun exprOp f a b = 
	let
		fun mul (VInt x, VInt y) = VInt (f (x,y))
		  | mul _ = raise TypeError
	in
		ESimple (EBinOp (mul, a, b))
	end
fun exprMul a b = exprOp (op *) a b
fun exprAdd a b = exprOp (op +) a b
fun exprSub a b = exprOp (op -) a b
fun exprApp f g = 
	let
		fun mul (VFun x, y) = x y
		  | mul _ = raise TypeError
	in
		ESimple (EBinOp (mul, f, g))
	end
fun exprComp f a b = 
	let
		fun mul (VInt x, VInt y) = VBool (f (x,y))
		  | mul _ = raise TypeError
	in
		ESimple (EBinOp (mul, a, b))
	end
fun exprGT a b = exprComp (op >) a b
fun exprEQ a b = exprComp (op =) a b
fun exprNEQ a b = exprComp (op <>) a b
fun exprFun s f = ESimple (EFun (Id s, f))
fun exprBlock sts = EBlock (SBlock (Block sts))
	
exception Simple
fun simple (ESimple s) = s
  | simple _ = raise Simple

fun stVal s e = SVal(Id s, e)
fun stAssign s e = SAssign(Id s, e)
fun stBlock sts = SBlock (Block sts)
fun stIf cond a b = SIf (simple(cond), Block a, Block b)
fun stWhile cond b = SWhile (simple(cond), Block b)
fun stFor x m sts = SFor (Id x, simple m, Block sts)
fun stYield e = SYield e
              
fun testVFun f i = 
	let
		val (VFun g) = f
	in
		g i
	end
		
		
val f1 = exprFun "x" (exprBlock [
			stVal "y" (exprMul (exprId "x") (exprId "x")),
			stVal "z" (exprMul (exprId "y") (exprId "y")),
			stYield (exprMul (exprId "z") (exprId "z"))])
			
val f2 = exprFun "x" (exprBlock [
			stVal "x" (exprMul (exprId "x") (exprId "x")),
			stVal "x" (exprMul (exprId "x") (exprId "x")),
			stYield (exprMul (exprId "x") (exprId "x"))])

val f3 = exprFun "x" (exprBlock [
			stAssign "x" (exprMul (exprId "x") (exprId "x")),
			stAssign "x" (exprMul (exprId "x") (exprId "x")),
			stYield (exprMul (exprId "x") (exprId "x"))])
			

val p1 = Block [
			stVal "x" (exprInt 2),
			stBlock [
				stVal "y" (exprMul (exprId "x") (exprId "x")),
				stVal "x" (exprId "y")
			],
			stYield (exprAdd (exprId "x") (exprId "x"))
		 ]
		 
val p2 = Block [
			stVal "x" (exprInt 2),
			stBlock [
				stVal "y"  (exprMul (exprId "x") (exprId "x")),
				stAssign "x" (exprId "y")
			],
			stYield (exprAdd (exprId "x") (exprId "x"))
		 ]

val p3 = Block [
			stVal "x" (exprInt 2),
			stBlock [
				stVal "y" (exprMul (exprId "x") (exprId "x")),
				stVal "x" (exprInt 0),
				stAssign "x" (exprId "y")
			],
			stYield (exprAdd (exprId "x") (exprId "x"))
		 ]
		 
val f4 = exprFun "x" (exprBlock [
			stVal "y" (exprMul (exprId "x") (exprId "x")),
			stVal "h" (exprFun "dummy" (exprId "y")),
			stAssign "y" (exprMul (exprId "y") (exprId "y")),
			stYield (exprMul (exprApp (exprId "h") (exprInt 0)) (exprId "y"))		
		 ])
		 
val f5 = 
	exprFun "a" (exprFun "b" ( 
		EBlock (stIf (exprEQ (exprId "a") (exprInt 0))
		        	[stYield (exprId "b")]
		        	[stVal "a" (exprId "a"),
		        	 stWhile (exprNEQ (exprId "b") (exprInt 0))
		        		[stIf (exprGT (exprId "a") (exprId "b"))
		        			[stAssign "a" (exprSub (exprId "a") (exprId "b"))]
		        			[stAssign "b" (exprSub (exprId "b") (exprId "a"))]
		        		],
		        	 stYield (exprId "a")])))
				  
val f5_illformed = 
	exprFun "a" (exprFun "b" ( 
		EBlock (stIf (exprEQ (exprId "a") (exprInt 0))
		        	[stYield (exprId "b")]
		        	[stWhile (exprNEQ (exprId "b") (exprInt 0))
		        		[stIf (exprGT (exprId "a") (exprId "b"))
		        			[stAssign "a" (exprSub (exprId "a") (exprId "b"))]
		        			[stAssign "b" (exprSub (exprId "b") (exprId "a"))]
		        		],
		        	 stYield (exprId "a")])))

		        	 
fun runf5 a b = testVFun (testVFun (evalExpr f5) (VInt a)) (VInt b)	

val p4 = Block[
        	stYield (exprInt 1),
        	stYield (exprInt 2),
        	stYield (exprInt 3)
		]

val p5 = Block[
			stVal "x" (exprInt 0),
			stYield (exprMul 
				(exprBlock [
					stAssign "x" (exprInt 1),
					stYield (exprId "x")])
				(exprBlock [
					stAssign "x" (exprAdd (exprId "x") (exprInt 2)),
					stYield (exprId "x")]))
		]
				 	
val p6 = Block[
			stVal "x" (exprInt 0),
			stYield (exprMul 
				(exprBlock [
					stVal "x" (exprInt 1),
					stYield (exprId "x")])
				(exprBlock [
					stVal "x" (exprAdd (exprId "x") (exprInt 2)),
					stYield (exprId "x")]))
		]
		
val f6 = exprFun "m" (exprFun "x" (exprBlock [
			stVal "y" (exprInt 0),
			stVal "p" (exprInt 1),
			stFor "a" (exprId "m") [
				stAssign "y" (exprAdd (exprId "y") (exprMul (exprId "a") (exprId "p"))),
				stAssign "p" (exprMul (exprId "p") (exprId "x")),
				stYield (exprId "y")
			]
		]))
		
fun runf6 m x = testVFun (testVFun (evalExpr f6) (VList (map (fn i => VInt i) m))) (VInt x)
	
			
		
		
			
	
	


	




