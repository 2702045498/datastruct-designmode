package com.bange.designmode.designmode.command;

public class LightOnCommand  implements  Command{

    // 聚合命令的执行对象
    private LightReciver lightReciver;
    public LightOnCommand(LightReciver lightReciver) {
        this.lightReciver = lightReciver;
    }

    @Override
    public void excute() {
        //调用接受者的方法
       lightReciver.on();
    }
    @Override
    public void undo() {
        lightReciver.off();
    }
}
