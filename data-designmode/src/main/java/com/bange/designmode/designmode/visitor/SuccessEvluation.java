package com.bange.designmode.designmode.visitor;

public class SuccessEvluation extends Action{
    @Override
    void manEvaluation(Man man) {
        System.out.println("男人评价成功");
    }

    @Override
    void womanEvaluation(Woman woman) {
        System.out.println("女人评价成功");
    }
}
