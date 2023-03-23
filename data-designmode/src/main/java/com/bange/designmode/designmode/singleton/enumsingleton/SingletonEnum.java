package com.bange.designmode.designmode.singleton.enumsingleton;
// 单例---枚举类方式
public enum SingletonEnum {
    INSTANCE;
    public static String hello(){
        return "hello---enum";
    }
}
