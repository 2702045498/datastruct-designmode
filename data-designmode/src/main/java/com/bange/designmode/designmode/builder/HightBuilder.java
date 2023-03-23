package com.bange.designmode.designmode.builder;

public class HightBuilder extends HouseBuilder{
    @Override
    void buildBase() {
        System.out.println("高楼打地基");
    }

    @Override
    void buildWall() {
        System.out.println("高楼键强");
    }

    @Override
    void rootfed() {
        System.out.println("高楼封顶");
    }
}
