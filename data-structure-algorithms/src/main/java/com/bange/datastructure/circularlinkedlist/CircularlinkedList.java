package com.bange.datastructure.circularlinkedlist;

public class CircularlinkedList {

    CircularNode first = null;

    //构建成一个count个node节点的环形链表
    public void add(int count) {
        // 辅助节点
        CircularNode currentNode = null;
        for (int i = 0; i <= count; i++) {
            CircularNode circularNode = new CircularNode(i);
            if (i == 0) {
                //第一个节点就创建成环形链表-指向自身节点
                first = circularNode;
                first.next = first;
                currentNode = first;
            } else {
                currentNode.next = circularNode;
                circularNode.next = first;
                // 当前节点后移
                currentNode = circularNode;
            }
        }
    }


    public void list() {
        if (first == null) {
            System.out.println("环形链表为空！");
            return;
        }
        CircularNode temp = first;
        while (true) {
            if (temp.next == first) {
                break;
            }
            System.out.println(temp.next);
            temp=temp.next;
        }


    }


}
