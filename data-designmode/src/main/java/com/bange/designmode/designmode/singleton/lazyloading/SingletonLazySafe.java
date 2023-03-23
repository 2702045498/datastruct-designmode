package com.bange.designmode.designmode.singleton.lazyloading;

// 懒汉式--线程安全(添加同步锁)
public class SingletonLazySafe {

    public static SingletonLazySafe instance;

    private SingletonLazySafe() {
    }
    // 当使用到对像才会创建，则称为懒汉式--添加同步锁
    public static synchronized SingletonLazySafe getInstance(){
        if(instance==null){
            instance=new SingletonLazySafe();
        }
        return instance;
    }

}
