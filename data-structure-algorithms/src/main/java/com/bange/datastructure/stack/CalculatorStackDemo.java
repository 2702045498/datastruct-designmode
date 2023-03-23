package com.bange.datastructure.stack;

public class CalculatorStackDemo {
    public static void main(String[] args) {
        CalculatorStack calculatorStack = new CalculatorStack(10);
        calculatorStack.push(1);
        calculatorStack.push(3);
        calculatorStack.push(5);
        calculatorStack.push(7);
        calculatorStack.list();
        System.out.println(calculatorStack.pop());
        System.out.println(calculatorStack.pop());
    }
}
