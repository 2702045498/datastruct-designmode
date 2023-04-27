package com.bange.designmode.juc.completefuture;

import java.util.concurrent.CompletableFuture;

public class CompleteFutureDemo1 {
    public static void main(String[] args) {
        String join = CompletableFuture.supplyAsync(() -> {
            return "hello";
        }).thenApplyAsync((v) -> {
            return v + "  world";
        }).join();
        System.out.println("==>"+join);

    }
}
