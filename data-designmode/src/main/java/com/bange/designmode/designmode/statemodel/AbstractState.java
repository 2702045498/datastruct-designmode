package com.bange.designmode.designmode.statemodel;

/**
 * 状态抽象类/接口
 */
public abstract class AbstractState {
    // 扣积分
    abstract  void  deductMoney();
    // 是否抽中奖品
    abstract boolean isRaffle();
    // 发放奖品
    abstract void dispensePrize();
}
