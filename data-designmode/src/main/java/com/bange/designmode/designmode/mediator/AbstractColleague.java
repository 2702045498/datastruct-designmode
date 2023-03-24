package com.bange.designmode.designmode.mediator;
// 同事抽象类
public abstract class AbstractColleague {
     String name;
    private AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator,String name) {
        this.mediator = mediator;
        this.name=name;
    }

    public AbstractMediator getMediator(){
        return this.mediator;
    }

    public abstract void sendMessage(int state);
}
