package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    /**
     * subtraction that takes minuend and subtrahend as int params and returns the difference
     * multiplication that takes multiplier and multiplicand as int params and returns the product
     * using JUnit, write and execute at least 2 tests for each method,
     * giving some information to the user regarding each test
     */
    public static int subtraction(int minuend, int subtrahend){
        return minuend - subtrahend;
    }
    public static int multiplication(int multiplier, int multiplicand){
        return multiplier * multiplicand;
    }
}