package com.bange.designmode.designmode.adapter.classadapter;
// 类适配器
public class VoltageAdapter extends Voltage_220V implements IVoltage_5V {
    @Override
    public int output() {
        return super.output()/44;
    }
}
