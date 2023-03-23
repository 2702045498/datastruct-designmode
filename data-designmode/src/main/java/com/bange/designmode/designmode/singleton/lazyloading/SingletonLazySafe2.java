package com.bange.designmode.designmode.singleton.lazyloading;

// 懒汉式--线程不安全(添加同步锁)
public class SingletonLazySafe2 {

    public static SingletonLazySafe2 instance;

    private SingletonLazySafe2() {
    }
    /*
       则称为懒汉式--同步锁加在代码块中
       线程不安全
     */
    public static synchronized SingletonLazySafe2 getInstance(){
        if(instance==null){
            synchronized (SingletonLazySafe2.class){
                instance=new SingletonLazySafe2();
            }
        }
        return instance;
    }

}
