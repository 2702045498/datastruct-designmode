package com.bange.designmode.designmode.responsibility;

public abstract class AbstractApprove {
    //下一个审批者
    AbstractApprove nextApprove;
    String name;

    public AbstractApprove(String name) {
        this.name = name;
    }
    // 设置下一个审批者
    public void setNextApprove(AbstractApprove nextApprove) {
        this.nextApprove = nextApprove;
    }
    // 处理请求由子类进行处理
    abstract  void processRequest(PurchaseRequest purchaseRequest);
}
