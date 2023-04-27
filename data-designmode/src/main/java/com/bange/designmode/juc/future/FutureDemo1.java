package com.bange.designmode.juc.future;

import java.math.BigDecimal;
import java.util.concurrent.CompletableFuture;

public class FutureDemo1 {
    public static void main(String[] args)throws Exception {
        CompletableFuture<BigDecimal> cf = CompletableFuture.supplyAsync(FutureDemo1::fetchPrice);
        cf.thenAccept((result)->{
            System.out.println("==>"+result);
        });
        cf.exceptionally((e)->{
            e.printStackTrace();
            return null;
        });
        Thread.sleep(200);
    }

    static BigDecimal fetchPrice() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
        if (Math.random() < 0.3) {
            throw new RuntimeException("fetch price failed!");
        }
        return BigDecimal.valueOf(5 + Math.random() * 20);
    }
}
