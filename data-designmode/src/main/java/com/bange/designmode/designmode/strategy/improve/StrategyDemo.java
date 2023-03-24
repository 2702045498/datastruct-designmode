package com.bange.designmode.designmode.strategy.improve;


public class StrategyDemo {
    public static void main(String[] args) {
        AbstractDuck wildDuck = new WildDuck();
        wildDuck.fly();
        System.out.println("------------");
        BJDuck bjDuck = new BJDuck();
        bjDuck.fly();

        System.out.println("-----修改bjDuck行为------");
        bjDuck.setFly(new NoFly());
        bjDuck.fly();
    }
}
