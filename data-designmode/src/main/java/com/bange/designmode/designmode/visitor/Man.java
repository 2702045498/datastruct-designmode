package com.bange.designmode.designmode.visitor;

/**
 * 1.使用到双分派：
 * （1）客户端调用accpet(Action action)是将man对象作为参数传入
 * （2）action调用manEvluation(this)右将man对象传出
 */
public class Man  extends Person{
    @Override
    void accept(Action action) {
        action.manEvaluation(this);
    }
}
