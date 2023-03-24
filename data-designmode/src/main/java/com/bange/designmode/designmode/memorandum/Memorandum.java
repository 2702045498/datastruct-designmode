package com.bange.designmode.designmode.memorandum;

public class Memorandum {
    int state;
    // 备忘对象-执行保存
    public Memorandum(int state) {
        this.state = state;
    }
    // 获取保存的数据
    public int getState() {
        return state;
    }
}
