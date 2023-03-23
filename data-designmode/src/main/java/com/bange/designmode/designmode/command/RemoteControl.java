package com.bange.designmode.designmode.command;

public class RemoteControl {
    Command[] onCommand;
    Command[] offCommand;
    Command undoCommand;
    public RemoteControl() {
        this.onCommand = new Command[5];
        this.offCommand =new Command[5];
        for (int i = 0; i < 5; i++) {
            this.onCommand[i]=new NoCommand();
            this.offCommand[i]=new NoCommand();
        }
    }
    // 给按钮设置命令
    void setCommand(int number,Command onCommand,Command offCommand){
        this.onCommand[number]=onCommand;
        this.offCommand[number]=offCommand;
    }
    // 按下按钮需要执行的命令
    void OnButton(int number){
        this.onCommand[number].excute();
        // 记录按下的按钮
        this.undoCommand=this.onCommand[number];
    }
    // 按下按钮需要执行的命令
    void offButton(int number){
        this.offCommand[number].excute();
        // 记录按下的按钮
        this.undoCommand=this.offCommand[number];
    }
    //撤销命令
    void undoCommand(){
        undoCommand.undo();
    }



}
