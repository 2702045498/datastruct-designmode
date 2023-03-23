package com.bange.datastructure.linkedlist.demo;

public class PetLinkedList {

    PetNode head = new PetNode(0, null, 0);

    public void addNode(PetNode petNode) {
        PetNode temp = head;
        while (true) {
            if (temp.next == null) {
                temp.next = petNode;
                break;
            }
            temp = temp.next;
        }
    }

    public void addByOrder(PetNode petNode) {
        PetNode temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            } else if (temp.next.number == petNode.number) {
                System.out.printf("编号为[%d]的节点已经存在，不能添加！\n", petNode.number);
                break;
            } else if (temp.next.number > petNode.number) {
                break;
            }
            temp = temp.next;
        }
        petNode.next = temp.next;
        temp.next = petNode;
    }

    public void list() {
        PetNode temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            System.out.println(temp.next);
            temp = temp.next;
        }

    }

    public void update(PetNode petNode) {
        PetNode temp = head;
        while (true) {
            if (temp.next == null) {
                System.out.printf("没有找到[%]编号的节点，无法修改!", petNode.number);
                break;
            } else if (temp.next.number == petNode.number) {
                temp.next.name = petNode.name;
                temp.next.age = petNode.age;
                break;
            } else {
                temp = temp.next;
            }
        }
    }


    public void delete(int num) {
        PetNode temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            } else if (temp.next.number == num) {
                temp.next = temp.next.next;
                break;
            } else {
                temp = temp.next;
            }
        }
    }

    //统计链表节点个数，不统计head头节点
    public int nodeCount() {
        PetNode temp = head;
        int count = 0;
        while (true) {
            if (temp.next == null) {
                break;
            }
            count++;
            temp = temp.next;
        }
        return count;
    }

    // 查找链表单倒数第k个节点
    public PetNode find(int index) {
        PetNode temp = head;
        int count = nodeCount();
        int num = 0;
        while (true) {
            if (temp.next == null) {
                System.out.println("链表为空！");
                return null;
            } else if (num == (count - index)) {
                return temp.next;
            } else {
                num++;
                temp = temp.next;
            }
        }

    }

    //反转链表
    public void reverse() {
        if (head.next == null || head.next.next == null) {
            System.out.println("==>链表为空或只有一个节点，不需要反转");
            return;
        }
        PetNode currentNode = head.next;
        PetNode nextNode = null;
        PetNode newHead = new PetNode();
        while (currentNode != null) {
            // 保存当前节点
            nextNode = currentNode.next;
            // 当前节点的下一个节点指向当前节点：此时currentNode.next表示第二个节点node2 ,newHead.next表示第一个节点node1
            currentNode.next = newHead.next;
            // 新头节点指向当前节点: 此时newHead.next表示新链表的第一个节点node,currentNode表示新链表的第二个节点
            newHead.next = currentNode;
            // 当前节点后移
            currentNode = nextNode;
        }
        // 头节点指向新的头节点的下一个节点
        head.next = newHead.next;
    }

    //反转链表
    public void reversePetLikedList() {
        // 链表只有一个节点时不需要反转
        if (head.next == null || head.next.next == null) {
            return;
        }
        //新建一个链表
        PetNode currentNode = head.next;
        PetNode newHead = new PetNode();
        PetNode nextNode = null;
        while (currentNode!= null) {
            nextNode = currentNode.next;
            currentNode.next=newHead.next;
            newHead.next=currentNode;
            currentNode=nextNode;
        }
        head.next=newHead.next;


    }


}
