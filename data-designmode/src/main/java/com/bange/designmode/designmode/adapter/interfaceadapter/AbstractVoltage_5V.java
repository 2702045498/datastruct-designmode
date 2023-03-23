package com.bange.designmode.designmode.adapter.interfaceadapter;
//抽象类实现接口的所有方法或者部分方法
public abstract class AbstractVoltage_5V implements IVoltage {

    @Override
    public int output5v() {
        return 5;
    }

    @Override
    public int output10v() {
        return 10;
    }

    @Override
    public int output15v() {
        return 15;
    }

    @Override
    public int output35v() {
        return 35;
    }

    @Override
    public int output80v() {
        return 80;
    }

    @Override
    public int output220v() {
        return 220;
    }
}
