package com.edu.chmnu.ki_123.c3.AuditoriumTask1;

import java.math.BigInteger;
import java.util.List;

public class FactorialOutput {
    public static void main(String[] args) {
        FactorialRangeCalculator rangeCalculator = new FactorialRangeCalculator();

        int start = 0;
        int end = 30;

        System.out.println("Calculating factorials of numbers from " + start + " to " + end + ":");

        List<BigInteger> factorials = rangeCalculator.calculateFactorialsInRange(start, end);

        for (int i = 0; i < factorials.size(); i++) {
            System.out.println(i + "! = " + factorials.get(i));
        }
    }
}