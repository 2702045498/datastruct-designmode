package com.bange.designmode.principle.di;

public class Cat  implements PetInterface{

    String foodName=null;

    @Override
    public void eat(FoodInterface foodInterface) {
        String food = foodInterface.stapleFood(foodName);
        System.out.println("猫吃了"+food);
    }
}
