package com.bange.designmode.designmode.memorandum;

public class Originator {
    private int state;
    // 备忘录模式--备忘保存到另一个对象中
    public Memorandum saveMemorrandum(){
        return new Memorandum(state);
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void getStateFromMemorandum(Memorandum memorandum){
        this.state= memorandum.state;
    }
}
