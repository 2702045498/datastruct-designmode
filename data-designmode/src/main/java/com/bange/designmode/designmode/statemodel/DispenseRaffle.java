package com.bange.designmode.designmode.statemodel;

public class DispenseRaffle extends AbstractState{
    private RaffleActivity raffleActivity;
    public DispenseRaffle(RaffleActivity raffleActivity) {
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
        if(raffleActivity.getCount() > 0){
            System.out.println("恭喜您中奖了");
            // 改状态为不能抽奖
            raffleActivity.setAbstractState(raffleActivity.getNoRaffle());
        }else{
            System.out.println("很遗憾，您没有奖品了");
            // 状态改为不能抽奖
            raffleActivity.setAbstractState(raffleActivity.getNoRaffle());
        }
    }
}
