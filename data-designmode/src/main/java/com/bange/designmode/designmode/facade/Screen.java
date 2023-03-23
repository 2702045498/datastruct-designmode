package com.bange.designmode.designmode.facade;

public class Screen {
    // 单例模式
    private static Screen instance=null;

    public static Screen getInstance(){
        if(instance==null){
            synchronized (Screen.class){
                if(instance==null){
                    instance=new Screen();
                }
            }
        }
        return instance;
    }


    public void up(){
        System.out.println("Screen up");
    }
    public void down(){
        System.out.println("Screen down");
    }
    public void play(){
        System.out.println("Screen play");
    }
}
