package com.bange.designmode.designmode.statemodel;

public class DispenseOutRaffle  extends  AbstractState{

    private RaffleActivity raffleActivity;

    public DispenseOutRaffle(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    void deductMoney() {
        System.out.println("不能扣除积分");
    }

    @Override
    boolean isRaffle() {
        System.out.println("不能抽奖");
        return false;
    }

    @Override
    void dispensePrize() {
        System.out.println("不能发放奖品");
    }
}
