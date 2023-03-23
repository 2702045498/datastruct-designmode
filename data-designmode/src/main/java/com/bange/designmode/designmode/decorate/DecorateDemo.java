package com.bange.designmode.designmode.decorate;

public class DecorateDemo {
    public static void main(String[] args) {
        // 1.点一份美式咖啡
        Drink drink = new CafeLatteCoffee();
        System.out.println("一份美式咖啡价格："+drink.getPrice());

        // 2.加一份巧克力
        drink = new Chocolate(drink);
        System.out.println("一份巧克力价格："+drink.getPrice());

        // 3.加一份牛奶
        drink=new Milk(drink);

        System.out.println("一份牛奶价格："+drink.getPrice());

        drink=new Chocolate(drink);
        System.out.println("一份巧克力价格："+drink.getPrice());
        System.out.println(drink.getDescript()+" 总计："+drink.cost());


    }
}
