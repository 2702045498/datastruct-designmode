package com.bange.designmode.juc.future;

import java.util.Random;
import java.util.concurrent.*;

public class FutureCallableDemo {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        Future<Integer> result = threadPool.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return new Random().nextInt(10);
            }
        });
        threadPool.shutdown();

        try {
            System.out.println("result:"+ result.get());
        } catch (Exception e) {
          e.printStackTrace();
        }
    }
}
