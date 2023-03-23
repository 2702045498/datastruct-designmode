package com.bange.designmode.designmode.singleton;

import com.bange.designmode.designmode.singleton.enumsingleton.SingletonEnum;
import com.bange.designmode.designmode.singleton.hungrymanstyle.Singleton;
import com.bange.designmode.designmode.singleton.hungrymanstyle.Singleton2;
import com.bange.designmode.designmode.singleton.lazyloading.SingletonLazy;

public class SingletonDemo {
    public static void main(String[] args) {
        // 1.饿汉式--静态变量
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance==instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
        // 2. 饿汉式--静态代码块
        Singleton2 instance3 = Singleton2.getInstance();
        Singleton2 instance4 = Singleton2.getInstance();
        System.out.println(instance3.hashCode());
        System.out.println(instance4.hashCode());

        // 3. 懒汉式--线程不安全
        SingletonLazy lazyInstance1= SingletonLazy.getInstance();
        SingletonLazy lazyInstance2= SingletonLazy.getInstance();
        System.out.println(lazyInstance1==lazyInstance2);

        SingletonEnum instance1 = SingletonEnum.INSTANCE;
        SingletonEnum instance5= SingletonEnum.INSTANCE;
        System.out.println(instance1==instance5);
        System.out.println(instance1.hello());
    }
}



