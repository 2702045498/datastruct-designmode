package com.bange.designmode.designmode.mediator;

public class TV  extends AbstractColleague{
    public TV(AbstractMediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int state) {
        this.getMediator().getMessage(state,this.name);
    }

    public void on(){
        System.out.println("打开电视");
    }
    public void off(){
        System.out.println("关闭电视");
    }
}
