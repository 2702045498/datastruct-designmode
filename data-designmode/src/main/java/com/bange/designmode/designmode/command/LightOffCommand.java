package com.bange.designmode.designmode.command;

public class LightOffCommand  implements Command{
    // 聚合命令的执行对象
    private LightReciver lightReciver;
    public LightOffCommand(LightReciver lightReciver) {
        this.lightReciver = lightReciver;
    }
    @Override
    public void excute() {
        lightReciver.off();
    }

    @Override
    public void undo() {
    lightReciver.on();
    }
}
