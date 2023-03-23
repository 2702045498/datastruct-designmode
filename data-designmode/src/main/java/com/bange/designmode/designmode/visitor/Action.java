package com.bange.designmode.designmode.visitor;

public abstract class Action {
    // 男性测评
    abstract  void manEvaluation(Man man);
    abstract void womanEvaluation(Woman woman);

}
