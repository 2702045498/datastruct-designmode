package com.bange.designmode.designmode.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollageImpl {
    List<Collage> collageList=new ArrayList<>();

    public CollageImpl(List<Collage> collageList) {
        this.collageList = collageList;
    }

    //输出学院
    public void printCollage(){
        Iterator<Collage> iterator = collageList.iterator();
        while (iterator.hasNext()){
            Collage collage = iterator.next();
            System.out.println("-----"+collage.getName()+"-------");
            printDepartment(collage.createIterator());
        }
    }

    // 输出专业
    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department department =(Department) iterator.next();
            System.out.println(department.getName());

        }
    }

}
