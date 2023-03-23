package com.bange.designmode.principle.di;

public class FishBone  implements  FoodInterface{
    @Override
    public String stapleFood(String name) {
        return name;
    }
}
