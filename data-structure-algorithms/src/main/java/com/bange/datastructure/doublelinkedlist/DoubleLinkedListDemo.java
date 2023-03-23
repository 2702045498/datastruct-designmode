package com.bange.datastructure.doublelinkedlist;

public class DoubleLinkedListDemo {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        DoubleHeroNode node1 = new DoubleHeroNode(1, "宋江", "及时雨");
        DoubleHeroNode node2 = new DoubleHeroNode(2, "卢俊义", "玉麒麟");
        DoubleHeroNode node3 = new DoubleHeroNode(3, "林冲", "豹子头");
        DoubleHeroNode node4 = new DoubleHeroNode(4, "鲁智深", "花和尚");
        DoubleHeroNode node5= new DoubleHeroNode(5, "武松", "行者");
        DoubleHeroNode node6 = new DoubleHeroNode(6, "花容", "小李广");
        DoubleHeroNode node9 = new DoubleHeroNode(9, "石秀", "拼命三郎");

    doubleLinkedList.addByOrder(node1);
    doubleLinkedList.addByOrder(node6);

    doubleLinkedList.addByOrder(node5);

    doubleLinkedList.addByOrder(node2);
    doubleLinkedList.addByOrder(node4);
    doubleLinkedList.addByOrder(node3);


        doubleLinkedList.list();
        System.out.println("----------update------------");
        DoubleHeroNode updateNode = new DoubleHeroNode(3, "公孙胜", "入云龙");
        doubleLinkedList.update(updateNode);
        doubleLinkedList.list();

        System.out.println("----------delete------------");
        doubleLinkedList.delete(4);
        doubleLinkedList.list();

    }
}
