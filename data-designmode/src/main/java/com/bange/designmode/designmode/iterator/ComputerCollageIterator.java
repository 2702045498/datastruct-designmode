package com.bange.designmode.designmode.iterator;

import java.util.Iterator;
import java.util.function.Consumer;

public class ComputerCollageIterator  implements Iterator {
    // 确定存储方式--数组
    private Department[] departmentArr;
    private int position=0; // 遍历位置

    public ComputerCollageIterator(Department[] departmentArr) {
        this.departmentArr = departmentArr;
    }

    @Override
    public boolean hasNext() {
        if(position>=departmentArr.length || departmentArr[position]==null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Department department = departmentArr[position];
        this.position++;
        return department;
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
