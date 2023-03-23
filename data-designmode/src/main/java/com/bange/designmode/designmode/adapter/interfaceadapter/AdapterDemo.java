package com.bange.designmode.designmode.adapter.interfaceadapter;



public class AdapterDemo {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.recharge(new Voltage_5V());
    }
}
