package com.bange.datastructure.stack;

public class StackNodeList {
    StackNode head =new StackNode(0);

    public void push(StackNode stackNode){
        StackNode temp=head;
        while (true){
           if(temp.next==null){
               temp.next=stackNode;
               break;
           }
           temp=temp.next;
        }
    }

    public void list(){
        //遍历输出
        StackNode temp=head;
        while (true){
            if(temp.next==null){
                break;
            }
            System.out.println("取出数据："+temp.next);
            temp=temp.next;
        }

    }

    public  void reveseList() {
        if(head.next==null||head.next.next==null){
            System.out.println("栈为空，不能数据！");
            return ;
        }
        StackNode temp=head.next;
        StackNode nextNode=null;
        StackNode newHead=new StackNode(0);
        while (temp!=null){
            nextNode=temp.next;
            temp.next=newHead.next;
            newHead.next=temp;
            temp=nextNode;
        }
        head.next=newHead.next;
    }



}
