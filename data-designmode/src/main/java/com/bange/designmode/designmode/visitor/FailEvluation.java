package com.bange.designmode.designmode.visitor;

public class FailEvluation  extends Action{
    @Override
    void manEvaluation(Man man) {
        System.out.println("男人评价失败");
    }

    @Override
    void womanEvaluation(Woman woman) {
        System.out.println("女人评价失败");
    }
}
