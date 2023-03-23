package com.bange.designmode.designmode.iterator;

import java.util.Iterator;

public class ComputerCollage  implements Collage{
Department[] departments;
int index=0;

    public ComputerCollage() {
        this.departments = new Department[5];
        addDepartment(new Department("Java专业","java专业"));
        addDepartment(new Department("C++专业","C++专业"));
        addDepartment(new Department("PHP专业","PHP专业"));
        addDepartment(new Department("C专业","C专业"));
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(Department department) {
        departments[index]=department;
        index++;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollageIterator(departments);
    }
}
