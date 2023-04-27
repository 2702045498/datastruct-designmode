package com.bange.designmode.juc.completefuture.service;


import com.bange.designmode.juc.completefuture.entity.Commodity;
import com.bange.designmode.juc.completefuture.entity.Stock;
import com.bange.designmode.juc.completefuture.entity.SysUser;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OrderServiceImpl {
    CommodityServiceImpl commodityService = new CommodityServiceImpl();
    StockServiceImpl stockService = new StockServiceImpl();
    UserServiceImpl userService = new UserServiceImpl();


    public void createOrder(Integer userId, Integer commodityId) {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        System.out.println("=startThread=>" + Thread.currentThread().getName());
        CompletableFuture<SysUser> userInfo = CompletableFuture.supplyAsync(() ->
                {
                    System.out.println("=userInfo=>" + Thread.currentThread().getName());
                    return userService.query(userId);
                }
                , threadPool);
        CompletableFuture<Commodity> commodityInfo = CompletableFuture.supplyAsync(() -> {
            System.out.println("=commodityInfo=>" + Thread.currentThread().getName());
            return commodityService.query(commodityId);
        }, threadPool);
        CompletableFuture<Stock> stockInfo = CompletableFuture.supplyAsync(() -> {
            System.out.println("=stockInfo=>" + Thread.currentThread().getName());
            return stockService.query(commodityId);
        }, threadPool);
        try {
            SysUser sysUser = userInfo.get();
            System.out.println(sysUser.toString());
            Commodity commodity1 = commodityInfo.get();
            System.out.println(commodity1.toString());
            Stock stock1 = stockInfo.get();
            if (stock1.getCount() > 20) {
                System.out.println("下单成功");
                System.out.println(stock1.toString());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("=endThread=>" + Thread.currentThread().getName());
        threadPool.shutdown();

    }

}
