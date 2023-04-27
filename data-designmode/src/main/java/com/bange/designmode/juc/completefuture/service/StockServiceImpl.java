package com.bange.designmode.juc.completefuture.service;

import com.bange.designmode.juc.completefuture.entity.Stock;

import java.util.HashMap;
import java.util.Map;

public class StockServiceImpl {
   static Map<Integer, Stock> map=new HashMap<>();
   static{
       map.put(1,new Stock(1,1,20));
       map.put(2,new Stock(2,2,30));
       map.put(3,new Stock(3,3,50));
       map.put(4,new Stock(4,4,40));
       map.put(5,new Stock(5,5,10));
       map.put(6,new Stock(6,6,2));
   }

   public Stock query(Integer id){
       try {
           Thread.sleep(1000);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
       return  map.get(id);
   }

}
