package com.bange.datastructure.stack;

public class StackNodeDemo {
    public static void main(String[] args) {
        StackNodeList nodeList = new StackNodeList();
        StackNode node1 = new StackNode(1);
        StackNode node2 = new StackNode(2);
        StackNode node3 = new StackNode(3);
        StackNode node4 = new StackNode(4);
        StackNode node5 = new StackNode(5);
        nodeList.push(node1);
        nodeList.push(node2);
        nodeList.push(node3);
        nodeList.push(node4);
        nodeList.push(node5);
        nodeList.reveseList();
        nodeList.list();
    }
}
