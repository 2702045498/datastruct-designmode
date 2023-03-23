package com.bange.designmode.designmode.command;
// 空命令：不需要执行，起作用是初始化
// 是一种设计模式，省去空判断
public class NoCommand  implements  Command{
    @Override
    public void excute() {

    }

    @Override
    public void undo() {

    }
}
