package com.bange.designmode.principle.di3;

public class Bone implements PetFood{
    @Override
    public String stapleFood(String foodName) {
        return foodName;
    }
}
