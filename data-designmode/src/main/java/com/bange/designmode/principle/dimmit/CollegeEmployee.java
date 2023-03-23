package com.bange.designmode.principle.dimmit;

public class CollegeEmployee {
    private int id;
    private String name;

    public CollegeEmployee() {
    }

    public CollegeEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CollegeEmployee{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
