package com.bange.designmode.designmode.builder;

/**
 * 建造者--抽象类
 */
public abstract class HouseBuilder {

  House house=  new House();

    // 建造流程
    //打桩
    abstract  void buildBase();
    // 键强
    abstract  void buildWall();
    //封顶
    abstract  void rootfed();
    // 建造房子
    public House buildHouse(){
        return house;
    }


}
