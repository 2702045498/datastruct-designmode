package com.bange.designmode.designmode.template;

public class PureSoyaMilk  extends  AbstractSoyMilk{
    @Override
    void addCondiment() {
        //空实现即可
    }
// 重写父类
    @Override
    boolean isCondiment() {
        return false;
    }
}
