package com.bange.designmode.designmode.adapter.interfaceadapter;

public class Phone {
   public void recharge(AbstractVoltage_5V iVoltage5V){
       int output = iVoltage5V.output5v();
       if(output==5){
           System.out.println("5v可以充电");
       }else{
           System.out.println("电压不适合充电");
       }
   }
}
