package com.bange.datastructure.hashtable;

public class EmployeeNode {
    public int id ;
    public String name;
    public EmployeeNode next;

    public EmployeeNode(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employee{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
