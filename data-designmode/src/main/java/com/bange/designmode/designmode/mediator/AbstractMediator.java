package com.bange.designmode.designmode.mediator;

public abstract class AbstractMediator {
    //注册同事对象
    abstract void register(String colleagueName,AbstractColleague colleague);
    abstract void getMessage(int state,String colleagueName);
    abstract void sendMessage();

}
