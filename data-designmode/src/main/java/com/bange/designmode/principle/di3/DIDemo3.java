package com.bange.designmode.principle.di3;

import com.bange.designmode.principle.di2.Food;

public class DIDemo3 {
    public static void main(String[] args) {
        PetFood petFood = new Bone();
        Dog dog = new Dog();
        dog.setPetFood(petFood);
        dog.eat(petFood.stapleFood("牛肉"));
    }
}
