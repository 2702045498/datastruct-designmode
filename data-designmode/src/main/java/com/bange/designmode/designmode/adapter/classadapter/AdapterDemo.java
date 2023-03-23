package com.bange.designmode.designmode.adapter.classadapter;

public class AdapterDemo {
    public static void main(String[] args) {
        Phone phone = new Phone();
        IVoltage_5V iVoltage5V = new VoltageAdapter();
        phone.recharge(iVoltage5V);
    }
}
