package com.bange.designmode.designmode.singleton.innerclass;
//单例---内部类方式
public class SingleInner {

    private static SingleInner instance;
        // 内部类
    private static class Singleton {
        private static final SingleInner INSTANCE = new SingleInner();
    }

    public static  SingleInner getInstance() {
        return Singleton.INSTANCE;
    }
}
