package com.bange.designmode.designmode.prototype.clone;

/**
 *  名称为tom的羊，白色，1岁
 */
public class Sheep  implements Cloneable{
    private String name;
    private int age;
    private  String color;

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    //实现默认的克隆方法
    @Override
    protected Sheep clone() throws CloneNotSupportedException {
        Sheep sheep=null;
        sheep=(Sheep)super.clone();
        return sheep;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Sheep{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
