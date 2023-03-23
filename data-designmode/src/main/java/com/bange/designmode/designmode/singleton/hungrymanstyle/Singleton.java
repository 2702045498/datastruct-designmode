package com.bange.designmode.designmode.singleton.hungrymanstyle;

// 饿汉式（静态变量）
public class Singleton{
    // 1.构造器私有化，外部不能new对象
    private Singleton() {
    }
    // 2.类内部创建
    private static final Singleton instance=new Singleton();
    // 3.提供一个静态方法
    public static Singleton getInstance(){
        return instance;
    }
}
