package com.bange.designmode.principle.di;

public class DiDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.foodName="niu";

        FoodInterface foodInterface= new FishBone();
        cat.eat(foodInterface);
    }
}
