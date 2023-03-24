package com.bange.designmode.designmode.responsibility;

import java.math.BigDecimal;

public class ResponsibilityDemo {
    public static void main(String[] args) {
        // 1.建立请求
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, BigDecimal.valueOf(9000), 1001);
        // 2.设立审批人
        DepartmentApprove departmentApprove = new DepartmentApprove("张主任");
        CollageApprove collageApprove = new CollageApprove("李院长");
        VicePrincipalApprove vicePrincipalApprove = new VicePrincipalApprove("王校长");
        PrincipalApprove principalApprove = new PrincipalApprove("龙校长");
        // 3.处理请求（设置成环状）
        departmentApprove.setNextApprove(collageApprove);
        collageApprove.setNextApprove(vicePrincipalApprove);
        vicePrincipalApprove.setNextApprove(principalApprove);
        principalApprove.setNextApprove(departmentApprove);
         // 4.从小的开始审批
        departmentApprove.processRequest(purchaseRequest);


    }
}
