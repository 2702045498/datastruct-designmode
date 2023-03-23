package com.bange.designmode.designmode.adapter.objadapter;

public class Phone {
   public void recharge(IVoltage_5V iVoltage5V){
       int output = iVoltage5V.output();
       if(output==5){
           System.out.println("5v可以充电");
       }else{
           System.out.println("电压不适合充电");
       }
   }
}
