package com.bange.datastructure.hashtable;

public class EmployeeHashTable {
    public EmployeeLinkedList[] employeeLinkedList;
    public int initCapacity;

    public EmployeeHashTable(int initCapacity) {
        //初始化hashtable中链表的总数
        this.employeeLinkedList = new EmployeeLinkedList[initCapacity];
        this.initCapacity = initCapacity;
        //分别初始化每一条链表
        for (int i = 0; i <initCapacity ; i++) {
            employeeLinkedList[i]=new EmployeeLinkedList();
        }
    }

    public EmployeeNode findEmployeeById(int id){
        int employeeLinkedListNumber = hashFunction(id);
        EmployeeNode employeeNode = employeeLinkedList[employeeLinkedListNumber].findEmployeeById(id);
        return employeeNode;
    }


    /**
     * 添加：需要根据散列函数获取添加的链表编号，然后再进行添加
     * @param employeeNode
     */
    public void add(EmployeeNode employeeNode) {
        int employeeLinkedListNumber = hashFunction(employeeNode.id);
        employeeLinkedList[employeeLinkedListNumber].add(employeeNode);
    }

    /**
     * 遍历hashtable
     */
    public void  list(){
        for (int i = 0; i <initCapacity ; i++) {
            employeeLinkedList[i].list(i);
        }
    }


    /**
     * 哈希散列函数：取模算法
     * 确定id存放在哪个链表（employeeLinkedList）中
     * @param id
     * @return
     */
    public int hashFunction(int id) {
        return id % initCapacity;
    }

}
