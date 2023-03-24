package com.bange.designmode.designmode.statemodel;

public class StateModeDemo {
    public static void main(String[] args) {
        // 活动对象，只有1次抽奖机会
        RaffleActivity raffleActivity = new RaffleActivity(1);
        for (int i = 0; i <5 ; i++) {
            System.out.printf("--------第[%d]次抽奖---------",i);
            raffleActivity.deductMoney();
//            raffleActivity.getCanBeRaffle();
            raffleActivity.isRaffle();
//            raffleActivity.getDispenseRaffle();
//            raffleActivity.getDispenseOutRaffle();
        }
    }
}
