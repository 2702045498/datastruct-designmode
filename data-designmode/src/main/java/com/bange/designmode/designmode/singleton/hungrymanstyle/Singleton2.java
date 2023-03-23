package com.bange.designmode.designmode.singleton.hungrymanstyle;

// 饿汉式（静态代码块）
public class Singleton2 {
    // 1.构造器私有化，外部不能new对象
    private Singleton2() {
    }
    // 2.类内部创建
    private static final Singleton2 instance;
    static{
        instance=new Singleton2();
    }

    // 3.提供一个静态方法
    public static Singleton2 getInstance(){
        return instance;
    }
}
