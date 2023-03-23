package com.bange.designmode.principle.di3;

public class Dog  implements MyPet{

    PetFood petFood;
    public void setPetFood(PetFood petFood) {
        this.petFood = petFood;
    }

    @Override
    public void eat(String foodName) {
        System.out.println("==>dog吃"+petFood.stapleFood(foodName));
    }
}
