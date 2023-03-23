package com.bange.designmode.designmode.combination;



public class Department extends Organization{
    public Department(String name, String desc) {
        super(name, desc);
    }

    @Override
    public void print() {
        System.out.println(getName());
    }


}
