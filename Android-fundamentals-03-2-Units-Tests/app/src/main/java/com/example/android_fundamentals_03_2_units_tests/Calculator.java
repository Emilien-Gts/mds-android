package com.example.android_fundamentals_03_2_units_tests;

public class Calculator {
    // Available operations
    public enum Operator {ADD, SUB, DIV, MUL}

    /**
     * Addition operation
     */
    public double addition(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }

    /**
     * Subtract operation
     */
    public double subtraction(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }

    /**
     * Divide operation
     */
    public double division(double firstOperand, double secondOperand) {
        return firstOperand / secondOperand;
    }

    /**
     * Multiply operation
     */
    public double multiplication(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }

    /**
     * power operation
     */
    public double power(double firstOperand, double secondOperand) {
        return Math.pow(firstOperand, secondOperand);
    }
}
