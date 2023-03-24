package com.bange.designmode.designmode.statemodel;

/**
 * 不能抽奖状态类
 */
public class NoRaffle extends AbstractState{

    private RaffleActivity raffleActivity;

    public NoRaffle(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    void deductMoney() {
        System.out.println("扣除50积分，可以进行抽奖");
        raffleActivity.setAbstractState(raffleActivity.getCanBeRaffle());
    }

    /**
     * 扣除后设置为可抽奖状态
     * @return
     */
    @Override
    boolean isRaffle() {
        System.out.println("扣除积分才能抽奖");
        return false;
    }

    /**
     * 当前状态不能发放奖品
     */
    @Override
    void dispensePrize() {
        System.out.println("不能发放奖品");
    }
}
