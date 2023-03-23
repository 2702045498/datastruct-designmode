package com.bange.datastructure.doublelinkedlist;

public class DoubleHeroNode {
    public int number;
    public String name;
    public String nickName;
    public  DoubleHeroNode next;
    public DoubleHeroNode pre;

    public DoubleHeroNode(int number, String name, String nickName) {
        this.number = number;
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DoubleHeroNode{");
        sb.append("number=").append(number);
        sb.append(", name='").append(name).append('\'');
        sb.append(", nickName='").append(nickName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
