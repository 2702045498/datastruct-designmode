package com.bange.designmode.designmode.singleton.lazyloading;

// 懒汉式--线程不安全
public class SingletonLazy {

    public static SingletonLazy instance;

    private SingletonLazy() {
    }
    // 当使用到对像才会创建，则称为懒汉式
    public static SingletonLazy getInstance(){
        if(instance==null){
            instance=new SingletonLazy();
        }
        return instance;
    }

}
