package com.bange.datastructure.doublelinkedlist;

public class DoubleLinkedList {
    DoubleHeroNode head = new DoubleHeroNode(0, null, null);

    public void delete(int num) {
        if (head.next == null) {
            System.out.println("链表为空，不能做删除操作！");
            return;
        }
        DoubleHeroNode temp = head.next;
        while (true) {
            //比较当前节点
            if (temp == null) {
                break;
            } else if (temp.number == num) {
                //执行删除
                temp.pre.next = temp.next;
                //判断节点是否为最后一个节点
                if (temp.next != null) {
                    temp.next.pre = temp.pre;
                }
                break;
            }
            temp = temp.next;
        }
    }

    /**
     * 修改一个节点
     *
     * @param doubleHeroNode
     */
    public void update(DoubleHeroNode doubleHeroNode) {
        if (head.next == null) {
            System.out.println("链表为空，不能做修改操作！");
            return;
        }
        DoubleHeroNode temp = head.next;
        while (true) {
            if (temp.next == null) {
                System.out.printf("找不到[%d]编号的节点，无法修改！\n", doubleHeroNode.number);
                break;
            } else if (temp.number == doubleHeroNode.number) {
                temp.name = doubleHeroNode.name;
                temp.nickName = doubleHeroNode.nickName;
                break;
            }
            temp = temp.next;
        }

    }


    /**
     * 添加：向双向链表添加数据
     *
     * @param doubleHeroNode
     */
    public void add(DoubleHeroNode doubleHeroNode) {
        DoubleHeroNode temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = doubleHeroNode;
        doubleHeroNode.pre = temp;
    }


    public void addByOrder(DoubleHeroNode doubleHeroNode) {
        DoubleHeroNode temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }else if (temp.next.number>doubleHeroNode.number) {
                temp.next.pre=doubleHeroNode;
                doubleHeroNode.next=temp.next;
                break;
            }
            temp = temp.next;
        }
        temp.next = doubleHeroNode;
        doubleHeroNode.pre = temp;
    }


    /**
     * 遍历链表
     */
    public void list() {
        if (head.next == null) {
            System.out.println("链表为空!");
            return;
        }
        DoubleHeroNode temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            System.out.println(temp.next);
            temp = temp.next;
        }
    }

}
