package com.edu.chmnu.ki_123.c3.AuditoriumTask1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FactorialRangeCalculator {
    private final FactorialCalculator calculator;

    public FactorialRangeCalculator() {
        this.calculator = new FactorialCalculator();
    }

    public List<BigInteger> calculateFactorialsInRange(int start, int end) {
        if (start < 0 || end < 0 || start > end) {
            throw new IllegalArgumentException("Invalid number range!");
        }

        List<BigInteger> factorials = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            factorials.add(calculator.calculateFactorial(i));
        }
        return factorials;
    }
}