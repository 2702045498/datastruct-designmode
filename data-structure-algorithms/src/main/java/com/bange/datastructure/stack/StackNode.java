package com.bange.datastructure.stack;

public class StackNode {
    public int number;
    public  StackNode next;

    public StackNode(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("StackNode{");
        sb.append("number=").append(number);
        sb.append('}');
        return sb.toString();
    }
}
