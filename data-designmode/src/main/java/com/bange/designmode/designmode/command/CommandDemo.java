package com.bange.designmode.designmode.command;

public class CommandDemo {
    public static void main(String[] args) {
        // 通过遥控器对电灯的操作
        LightReciver lightReciver = new LightReciver();
        // 命令
        Command lightOffCommand = new LightOffCommand(lightReciver);
        Command lightOnCommand = new LightOnCommand(lightReciver);
        // 遥控器和设置命令
        RemoteControl remoteControl = new RemoteControl();
        // number=0是对灯的控制命令
        remoteControl.setCommand(0,lightOnCommand,lightOffCommand);
        // 按下灯的开的按钮
        remoteControl.OnButton(0);
        remoteControl.undoCommand();

    }
}
