package com.bange.datastructure.hashtable;

public class EmployeeLinkedList {
    public EmployeeNode head;


    public EmployeeNode findEmployeeById(int id){
        if(head==null){
            System.out.println("链表为空！");
            return null;
        }
        EmployeeNode temp=head;
        EmployeeNode currentNode=null;
        while (true){
            if(temp.next==null){
                break;
            }
            if(temp.id==id){
                currentNode=temp;
                break;
            }
            temp=temp.next;
        }
        return currentNode;

    }


    public void add(EmployeeNode employeeNode) {
        if (head == null) {
            head = employeeNode;
        } else {
            EmployeeNode temp = head;
            while (true) {
                if (temp.next == null) {
                    break;
                }
                temp = temp.next;
            }
            temp.next = employeeNode;
        }

    }


    public void list(int linkedListNumber) {
        if (head == null) {
            System.out.printf("第[%d]链表为空！", linkedListNumber);
            return;
        }
        EmployeeNode temp = head;
        System.out.printf("取出第[%d]条链表数据：", linkedListNumber);
        while (true) {
            System.out.print(temp);
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        System.out.println();
    }

}
