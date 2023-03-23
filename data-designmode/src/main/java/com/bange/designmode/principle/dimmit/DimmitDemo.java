package com.bange.designmode.principle.dimmit;

import com.bange.designmode.principle.dimmit.improve.CollageManager2;
import com.bange.designmode.principle.dimmit.improve.SchooleManager2;

public class DimmitDemo {
    public static void main(String[] args) {
//        SchooleManager schooleManager = new SchooleManager();
//        CollageManager collageManager = new CollageManager();
        SchooleManager2 schooleManager2 = new SchooleManager2();
        CollageManager2 collageManager2 = new CollageManager2();
        schooleManager2.printAllEmployee(collageManager2);
    }
}
