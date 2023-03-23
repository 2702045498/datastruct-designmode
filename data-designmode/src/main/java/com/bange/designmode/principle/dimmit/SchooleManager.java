package com.bange.designmode.principle.dimmit;

import java.util.ArrayList;
import java.util.List;

public class SchooleManager {

    public List<Employee> getAllEmployee(){
        ArrayList<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            employees.add(new Employee(i,"学校总部员工"+i));
        }
        return employees;
    }

    /**
     * 分析：
     * 1.CollegeEmployee不是SchooleManager类的直接朋友
     * 2.CollegeEmployee是以局部变量的方式出现在SchooleManager类中
     * 3.违反了迪米特法则，应该将输出放在CollageManager类中，
     * 不应将CollegeEmployee类信息过多暴露在别的类中
     * 注：迪米特法则：就是不要将类的方法实现写到别的类中去
     */
  public  void printAllEmployee(CollageManager collageManager){
//      List<CollegeEmployee> managerAllEmployee = collageManager.getAllEmployee();
//      for (CollegeEmployee emp:managerAllEmployee) {
//          System.out.println("=学院员工=>"+emp);
//      }

     List<Employee> allEmployee = getAllEmployee();
      allEmployee.stream().forEach(item->{
          System.out.println(item);
      });
  }

}
