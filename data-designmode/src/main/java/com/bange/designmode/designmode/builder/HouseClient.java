package com.bange.designmode.designmode.builder;

public class HouseClient {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirecter houseDirecter = new HouseDirecter(commonHouse);
        House house = houseDirecter.constractHouse();

        System.out.println(house);

        HightBuilder hightBuilder = new HightBuilder();
        houseDirecter.setHouseBuilder(hightBuilder);
        houseDirecter.constractHouse();

    }
}
