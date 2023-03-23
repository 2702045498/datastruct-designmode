package com.bange.designmode.principle.ocp.improve;

/**
 * 继承图形抽象类，实现具体图形
 */
public class Rectangle  extends Shape {
    @Override
    void draw() {
        System.out.println("==>绘制矩形");
    }
}
