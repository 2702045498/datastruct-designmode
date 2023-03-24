package com.bange.designmode.designmode.statemodel;

import java.util.Random;

/**
 * 可以抽奖状态
 */
public class CanBeRaffle extends AbstractState{
    private  RaffleActivity raffleActivity;

    public CanBeRaffle(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    void deductMoney() {
        System.out.println("已经扣取积分");
    }

    @Override
    boolean isRaffle() {

        int num= new Random().nextInt(5);
        System.out.println("正在抽奖"+num);
        if(num==0){
            // 改变状态为发放奖品状态
            raffleActivity.setAbstractState(raffleActivity.getDispenseRaffle());
            return true;
        }else {
            // 改变状态为不能抽奖状态
            raffleActivity.setAbstractState(raffleActivity.getNoRaffle());
            return false;
        }

    }

    @Override
    void dispensePrize() {
        System.out.println("没有中奖，不能发放奖品");
    }
}
