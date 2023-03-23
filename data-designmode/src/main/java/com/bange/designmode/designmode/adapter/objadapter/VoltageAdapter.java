package com.bange.designmode.designmode.adapter.objadapter;
//对象适配器
public class VoltageAdapter  implements IVoltage_5V {
    // 对象适配器--使用组合方式
  private   Voltage_220V voltage220V;

    public VoltageAdapter(Voltage_220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output() {
        return voltage220V.output()/44;
    }
}
