package com.bange.designmode.designmode.adapter.objadapter;

public class AdapterDemo {
    public static void main(String[] args) {
        Phone phone = new Phone();
        IVoltage_5V iVoltage5V = new VoltageAdapter(new Voltage_220V());
        phone.recharge(iVoltage5V);
    }
}
