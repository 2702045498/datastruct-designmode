package com.bange.datastructure.hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        EmployeeHashTable employeeHashTable = new EmployeeHashTable( 3);
        EmployeeNode node1 = new EmployeeNode(1, "tom");
        EmployeeNode node2 = new EmployeeNode(2, "jerry");
        EmployeeNode node3 = new EmployeeNode(3, "jobe");
        EmployeeNode node4 = new EmployeeNode(4, "daxiang");
        EmployeeNode node5 = new EmployeeNode(5, "rose");
        EmployeeNode node6 = new EmployeeNode(6, "kiki");
        EmployeeNode node7 = new EmployeeNode(7, "weiwei");
        EmployeeNode node8 = new EmployeeNode(8, "niuniu");
        EmployeeNode node9= new EmployeeNode(9, "xixi");
        employeeHashTable.add(node1);
        employeeHashTable.add(node2);
        employeeHashTable.add(node3);
        employeeHashTable.add(node4);
        employeeHashTable.add(node5);
        employeeHashTable.add(node6);
        employeeHashTable.add(node7);
        employeeHashTable.add(node8);
        employeeHashTable.add(node9);

        employeeHashTable.list();

        System.out.println(employeeHashTable.findEmployeeById(3));


    }
}
