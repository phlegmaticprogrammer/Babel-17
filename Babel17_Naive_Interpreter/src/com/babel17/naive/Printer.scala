package com.babel17.naive

class Printer {
   val builder = new StringBuilder()
   var indent = 0
   var newline = true
   private def printIndent {
     if (!newline) return
     newline = false
     var i = 0
     while (i < indent) {
       builder.append(" ")
       i = i + 1
     }
   }
   def break() {
     if (!newline) println("")
   }
   def println(s : String) {
     printIndent
     builder.append(s)
     builder.append("\n")
     newline = true
   }
   def print(s : String) {
     printIndent
     builder.append(s)
   }
   def addIndent {
     indent += 2
   }
   def subIndent {
     indent -= 2
   }
   override def toString : String = builder.toString
}
