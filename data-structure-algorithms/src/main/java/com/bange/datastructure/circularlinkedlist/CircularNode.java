package com.bange.datastructure.circularlinkedlist;

public class CircularNode {
    public int number;
    public CircularNode next;

    public CircularNode(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CircularNode{");
        sb.append("number=").append(number);
        sb.append('}');
        return sb.toString();
    }
}
