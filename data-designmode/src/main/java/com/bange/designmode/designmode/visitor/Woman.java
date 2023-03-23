package com.bange.designmode.designmode.visitor;

public class Woman  extends Person{
    @Override
    void accept(Action action) {
        action.womanEvaluation(this);
    }
}
