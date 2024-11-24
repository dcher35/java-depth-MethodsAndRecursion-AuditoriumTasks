package com.edu.chmnu.ki_123.c3.AuditoriumTask1;

import java.math.BigInteger;

public class FactorialCalculator {
    public BigInteger calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("The number must be non-negative!");
        }
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(calculateFactorial(n - 1));
    }
}