package com.bange.designmode.designmode.builder;

/**
 * 普通房子建造--与房子House类解藕
 */
public class CommonHouse extends HouseBuilder{

    @Override
    void buildBase() {
        super.house.setBase("地基5米");
        System.out.println("普通房子打地基");
    }

    @Override
    void buildWall() {
        super.house.setWall("强高3.5米");
        System.out.println("普通房子打键强");
    }

    @Override
    void rootfed() {
        super.house.setRootf("半年后封顶");
        System.out.println("普通房子打封顶");
    }
}
