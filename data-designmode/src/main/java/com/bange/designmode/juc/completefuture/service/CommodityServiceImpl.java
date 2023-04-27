package com.bange.designmode.juc.completefuture.service;

import com.bange.designmode.juc.completefuture.entity.Commodity;

import java.util.HashMap;
import java.util.Map;

public class CommodityServiceImpl {
   static Map<Integer, Commodity> map=new HashMap<>();
   static{
       map.put(1,new Commodity(1,"手机"));
       map.put(2,new Commodity(2,"衣服"));
       map.put(3,new Commodity(3,"车子"));
       map.put(4,new Commodity(4,"手表"));
       map.put(5,new Commodity(5,"电视"));
       map.put(6,new Commodity(6,"电影"));
   }

   public Commodity query(Integer id){
       try {
           Thread.sleep(1000);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
       return  map.get(id);
   }

}
