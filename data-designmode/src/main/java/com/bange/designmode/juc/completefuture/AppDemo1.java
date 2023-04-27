package com.bange.designmode.juc.completefuture;

import com.bange.designmode.juc.completefuture.service.OrderServiceImpl;

public class AppDemo1 {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        OrderServiceImpl orderService = new OrderServiceImpl();
        orderService.createOrder(1,2);
        long end=System.currentTimeMillis();
        System.out.println("耗时："+(end-start));
    }
}
