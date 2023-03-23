package com.bange.designmode.designmode.facade;

public class LoudspeakerBox {

    // 单例模式
    private static LoudspeakerBox instance=null;

    public static LoudspeakerBox getInstance(){
        if(instance==null){
            synchronized (LoudspeakerBox.class){
                if(instance==null){
                    instance=new LoudspeakerBox();
                }
            }
        }
        return instance;
    }


    public void on(){
        System.out.println("LoudspeakerBox on");
    }
    public void off(){
        System.out.println("LoudspeakerBox off");
    }
    public void turn(){
        System.out.println("LoudspeakerBox turn");
    }
}
