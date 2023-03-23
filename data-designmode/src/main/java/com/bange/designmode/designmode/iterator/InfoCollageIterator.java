package com.bange.designmode.designmode.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class InfoCollageIterator  implements Iterator {

    List<Department> departmentList=new ArrayList<>();
    int index=-1;

    public InfoCollageIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if(index>=departmentList.size()-1){
            return false;
        }
        index++;
        return true;
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }

    @Override
    public void forEachRemaining(Consumer action) {
        Iterator.super.forEachRemaining(action);
    }
}
