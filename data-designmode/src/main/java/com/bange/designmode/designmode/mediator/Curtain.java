package com.bange.designmode.designmode.mediator;

public class Curtain extends AbstractColleague{

    public Curtain(AbstractMediator mediator, String name) {
        super(mediator, name);
        // 添加一个具体中介者
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int state) {
        this.getMediator().getMessage(state,this.name);
    }

    public void up(){
        System.out.println("窗帘拉起来");
    }
    public void down(){
        System.out.println("窗帘打开来");
    }
}
