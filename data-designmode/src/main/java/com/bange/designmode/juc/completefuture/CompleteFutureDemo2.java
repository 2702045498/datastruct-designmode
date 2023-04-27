package com.bange.designmode.juc.completefuture;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.util.concurrent.CompletableFuture;

public class CompleteFutureDemo2 {
    public static void main(String[] args) throws Exception {
        long start = LocalDateTime.now().getLong(ChronoField.NANO_OF_SECOND);
        CompletableFuture<Integer> step1 = CompletableFuture.supplyAsync(() -> {
            return step1();
        });
        CompletableFuture<Integer> step2 = CompletableFuture.supplyAsync(() -> {
            return step2();
        });
        CompletableFuture<Integer> step3 = CompletableFuture.supplyAsync(() -> {
            return step3();
        });
        CompletableFuture<Void> allOf = CompletableFuture.allOf(step1, step2, step3);
        allOf.join();
        Void unused = allOf.get();


//        step1();
//        step2();
//        step3();
        long end = LocalDateTime.now().getLong(ChronoField.NANO_OF_SECOND);
        System.out.println("==>"+(end-start));
    }

    public static Integer step1() {
        System.out.println("step1:" + 100);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return 100;
    }

    public static Integer step2() {
        System.out.println("step2:" + 200);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return 200;
    }

    public static Integer step3() {
        System.out.println("step3:" + 300);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return 300;
    }
}
