package com.bange.designmode.principle.dimmit;

import java.util.ArrayList;
import java.util.List;

public class CollageManager {

    public List<CollegeEmployee> getAllEmployee(){
       List<CollegeEmployee> employees = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            employees.add(new CollegeEmployee(i,"学院员工"+i));
        }
        return employees;
    }
}
