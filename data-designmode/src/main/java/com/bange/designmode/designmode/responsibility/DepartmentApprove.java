package com.bange.designmode.designmode.responsibility;

import java.math.BigDecimal;

public class DepartmentApprove  extends  AbstractApprove{

    public DepartmentApprove(String name) {
        super(name);
    }

    @Override
    void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.price.compareTo(BigDecimal.valueOf(5000))<=0){
            System.out.printf("请求编号[%d]被[%s]处理了",purchaseRequest.id,this.name);
        }else{
            nextApprove.processRequest(purchaseRequest);
        }
    }
}
