package com.bange.designmode.designmode.visitor;

public abstract class Person {
    //提供一个方法，访问者可以访问
   abstract void  accept(Action action);
}
