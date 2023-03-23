package com.bange.designmode.designmode.iterator;

import java.util.Iterator;

public interface Collage {
    String getName();

    void addDepartment(Department department);

    Iterator createIterator();
}
