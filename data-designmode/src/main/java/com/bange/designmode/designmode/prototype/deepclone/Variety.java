package com.bange.designmode.designmode.prototype.deepclone;

import java.io.Serializable;
// 作为Sheep类的属性，需要先实现clone方法
public class Variety implements Serializable ,Cloneable {
    private int number;
    private  String name;

    public Variety(int number, String name) {
        this.number = number;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Variety{");
        sb.append("number=").append(number);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
