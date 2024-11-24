package com.edu.chmnu.ki_123.c3.AuditoriumTask1;

import org.junit.jupiter.api.Test;
import java.math.BigInteger;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    //Тест на обчислення факторіала
    @Test
    public void testCalculateFactorial() {
        FactorialCalculator calculator = new FactorialCalculator();

        assertEquals(BigInteger.ONE, calculator.calculateFactorial(0));
        assertEquals(BigInteger.ONE, calculator.calculateFactorial(1));
        assertEquals(BigInteger.valueOf(120), calculator.calculateFactorial(5));
    }

    // Тест на виняток для від'ємного числа
    @Test
    public void testNegativeFactorial() {
        FactorialCalculator calculator = new FactorialCalculator();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.calculateFactorial(-1));

        assertTrue(exception.getMessage().contains("The number must be non-negative!"));
    }

    // Тест на обчислення факторіалів у діапазоні
    @Test
    public void testCalculateFactorialsInRange() {
        FactorialRangeCalculator rangeCalculator = new FactorialRangeCalculator();

        List<BigInteger> factorials = rangeCalculator.calculateFactorialsInRange(0, 5);
        assertEquals(BigInteger.ONE, factorials.get(0));
        assertEquals(BigInteger.ONE, factorials.get(1));
        assertEquals(BigInteger.valueOf(120), factorials.get(5));
    }

    // Тест на некоректний діапазон
    @Test
    public void testInvalidRange() {
        FactorialRangeCalculator rangeCalculator = new FactorialRangeCalculator();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> rangeCalculator.calculateFactorialsInRange(5, 3));

        assertTrue(exception.getMessage().contains("Invalid number range!"));
    }
}