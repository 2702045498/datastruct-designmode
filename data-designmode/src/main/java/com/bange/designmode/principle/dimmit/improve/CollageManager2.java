package com.bange.designmode.principle.dimmit.improve;

import com.bange.designmode.principle.dimmit.CollegeEmployee;

import java.util.ArrayList;
import java.util.List;

public class CollageManager2 {
    public List<CollegeEmployee> getAllEmployee(){
        List<CollegeEmployee> employees = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            employees.add(new CollegeEmployee(i,"学院员工"+i));
        }
        return employees;
    }

    public void printCollageEmployee(){
        List<CollegeEmployee> employees = getAllEmployee();
        employees.stream().forEach(item->{
            System.out.println(item);
        });
    }
}
