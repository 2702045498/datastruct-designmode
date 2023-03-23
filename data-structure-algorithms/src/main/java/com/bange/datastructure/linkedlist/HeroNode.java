package com.bange.datastructure.linkedlist;

public class HeroNode {
    public int number; // 编号
    public String name;
    public String nickName;
    public  HeroNode next; // 指向下一个节点

    public HeroNode() {
    }

    public HeroNode(int number, String name, String nickName) {
        this.number = number;
        this.name = name;
        this.nickName = nickName;
    }





    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("HeroNode{");
        sb.append("number=").append(number);
        sb.append(", name='").append(name).append('\'');
        sb.append(", nickName='").append(nickName).append('\'');
//        sb.append(", next=").append(next);
        sb.append('}');
        return sb.toString();
    }
}
