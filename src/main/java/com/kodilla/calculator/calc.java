package com.kodilla.kodilla_4_6;

class Calculator {
    public int sum(int a , int b) {
        return a + b ;
    }
    public int subtract(int a , int b) {
        return a - b ;
    }

}

class TestCalculator
{
    public static void main (String[] args) throws java.lang.Exception {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(4,6));
        System.out.println(calc.subtract(4,6));
    }
}