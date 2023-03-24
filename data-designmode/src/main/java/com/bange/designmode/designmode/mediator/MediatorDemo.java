package com.bange.designmode.designmode.mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        // 中介者
        AbstractMediator concreteMediator = new ConcreteMediator();
        // 具体同事
        AlarmClock alarmClock = new AlarmClock(concreteMediator, "AlarmClock");
        TV tv = new TV(concreteMediator, "TV");
        Curtain curtain = new Curtain(concreteMediator, "Curtain");
        // 注册到中介当中去
        concreteMediator.register("AlarmClock",alarmClock);
        concreteMediator.register("TV",tv);
        concreteMediator.register("Curtain",curtain);
        // 闹钟响就发送消息---消息由中介者协调 ，由哪个同事对象进行执行
        alarmClock.sendMessage(0);
        //tv发送消息
        tv.sendMessage(0);

    }
}
