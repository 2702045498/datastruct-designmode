package com.bange.datastructure.linkedlist.demo;

public class PetNode {
    public int number;
    public String name;
    public int age;
    public PetNode next;

    public PetNode() {
    }

    public PetNode(int number, String name, int age) {
        this.number = number;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PetNode{");
        sb.append("number=").append(number);
        sb.append(", name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
