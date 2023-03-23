package com.bange.designmode.designmode.builder;

/**
 * 构建模式指挥者
 */
public class HouseDirecter {
    private  HouseBuilder houseBuilder;

    public HouseDirecter() {
    }

    // 构造方式转入
    public HouseDirecter(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    // setter方式传入
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    //指挥者--指挥构建流程
    public House constractHouse(){
        houseBuilder.buildBase();
        houseBuilder.buildWall();
        houseBuilder.rootfed();
        House house = houseBuilder.buildHouse();
        return house;

    }

}
