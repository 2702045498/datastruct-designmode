package com.bange.designmode.designmode.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollage  implements Collage{

List<Department> departmentList;

    public InfoCollage() {
        this.departmentList  =new ArrayList<>();
        addDepartment(new Department("信息安全专业","信息安全专业"));
        addDepartment(new Department("电子信息专业","电子信息专业"));
        addDepartment(new Department("无线电专业","无线电专业"));
        addDepartment(new Department("智能专业","智能专业"));
    }

    @Override
    public String getName() {
        return "信息学院";
    }

    @Override
    public void addDepartment(Department department) {
        departmentList.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollageIterator(departmentList);
    }
}
