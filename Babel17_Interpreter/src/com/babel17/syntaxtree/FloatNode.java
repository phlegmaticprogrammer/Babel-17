package com.babel17.syntaxtree;

import java.math.*;


public class FloatNode extends Node {

    // value = mantissa * 10^exponent
    public FloatNode(BigInteger mantissa, BigInteger exponent) {
        this.mantissa = mantissa;
        this.exponent = exponent;
    }

    public NodeList children() {
        return new NodeList();
    }

    public BigInteger mantissa() {
        return mantissa;
    }

    public BigInteger exponent() {
        return exponent;
    }

    private BigInteger mantissa;
    private BigInteger exponent;



}