package com.bange.designmode.designmode.facade;

public class DVDPlayer {
    // 单例模式
    private static DVDPlayer instance=null;

    public static DVDPlayer getInstance(){
        if(instance==null){
            synchronized (DVDPlayer.class){
                if(instance==null){
                    instance=new DVDPlayer();
                }
            }
        }
        return instance;
    }

    public void on(){
        System.out.println("dvd on");
    }
    public void off(){
        System.out.println("dvd off");
    }
    public void play(){
        System.out.println("dvd play");
    }
    public void pause(){
        System.out.println("dvd pause");
    }


}
