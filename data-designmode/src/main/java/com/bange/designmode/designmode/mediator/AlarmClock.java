package com.bange.designmode.designmode.mediator;

public class AlarmClock extends AbstractColleague {

    public AlarmClock(AbstractMediator mediator, String name) {
        super(mediator, name);
        // 添加一个具体中介者
        mediator.register(name, this);
    }

    public void sendAlarmClock(int state) {
        sendMessage(state);
    }

    @Override
    public void sendMessage(int state) {
        this.getMediator().getMessage(state,this.name);
    }

    public void close(){
        System.out.println("关闭闹钟");
    }
}
