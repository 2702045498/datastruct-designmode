package com.bange.designmode.juc.completefuture.service;


import com.bange.designmode.juc.completefuture.entity.SysUser;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class UserServiceImpl {
   static Map<Integer, SysUser> map=new HashMap<>();
   static{
       map.put(1,new SysUser(1,"张三","123@qq.com",20, LocalDateTime.now()));
       map.put(2,new SysUser(2,"李四","123456@qq.com",25, LocalDateTime.now()));
       map.put(3,new SysUser(3,"王五","12345678@qq.com",30, LocalDateTime.now()));


   }

   public SysUser query(Integer id){
       try {
           Thread.sleep(1000);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
       return  map.get(id);
   }

}
