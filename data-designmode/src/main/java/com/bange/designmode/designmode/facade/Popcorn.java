package com.bange.designmode.designmode.facade;

public class Popcorn {
    // 单例模式
    private static Popcorn instance=null;

    public static Popcorn getInstance(){
        if(instance==null){
            synchronized (Popcorn.class){
                if(instance==null){
                    instance=new Popcorn();
                }
            }
        }
        return instance;
    }


    public void on(){
        System.out.println("Popcorn on");
    }
    public void off(){
        System.out.println("Popcorn off");
    }
    public void pop(){
        System.out.println("Popcorn pop");
    }
}
