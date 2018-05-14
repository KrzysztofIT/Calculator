package com.kodilla.calculator;


class TestCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(4, 6));
        System.out.println(calc.subtract(4, 6));
    }
}