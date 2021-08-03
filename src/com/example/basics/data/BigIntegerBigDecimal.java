package com.example.basics.data;

import java.math.*;

public class BigIntegerBigDecimal {

    public static void main(String args[]) {
        
        BigInteger bigInt = new BigInteger("34894714948949");
        bigInt = bigInt.add(new BigInteger("123819381939"));
        System.out.println("Wynik: "+bigInt);

        BigDecimal decimal = new BigDecimal("18923918391839");
        decimal = decimal.pow(5);
        decimal = decimal.subtract(new BigDecimal("1932819231932891"));
        System.out.println("Wynik: "+decimal.toString());
    }
}
