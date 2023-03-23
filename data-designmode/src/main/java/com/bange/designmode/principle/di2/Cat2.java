package com.bange.designmode.principle.di2;



public class Cat2 implements Pet {
    Food food;
    public Cat2() {
    }

    public Cat2(Food food) {
        this.food = food;
    }

    @Override
    public void eat() {
        System.out.println("猫吃了"+food.stapleFood());
    }


}
