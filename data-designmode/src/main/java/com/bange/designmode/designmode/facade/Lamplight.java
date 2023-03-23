package com.bange.designmode.designmode.facade;

public class Lamplight {
    // 单例模式
    private static Lamplight instance=null;

    public static Lamplight getInstance(){
        if(instance==null){
            synchronized (Lamplight.class){
                if(instance==null){
                    instance=new Lamplight();
                }
            }
        }
        return instance;
    }


    public void on(){
        System.out.println("Lamplight on");
    }
    public void off(){
        System.out.println("Lamplight off");
    }
    public void lighten(){
        System.out.println("Lamplight lighten");
    }
}
