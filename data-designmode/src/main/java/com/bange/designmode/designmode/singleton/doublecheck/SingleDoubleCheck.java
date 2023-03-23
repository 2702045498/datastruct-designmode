package com.bange.designmode.designmode.singleton.doublecheck;

public class SingleDoubleCheck {
    private static SingleDoubleCheck instance;

    private  SingleDoubleCheck(){}

    /**
     * 双重检查-同步代码块
     * 线程安全
     * @return
     */
    public static SingleDoubleCheck getInstance(){
        if(instance==null){
            synchronized (SingleDoubleCheck.class){
                if(instance==null){
                    instance=new SingleDoubleCheck();
                }
            }
        }
        return instance;
    }

}
