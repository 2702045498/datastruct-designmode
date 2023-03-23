package com.bange.designmode.designmode.iterator;

import java.util.ArrayList;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Collage> collageArrayList = new ArrayList<>();
        Collage computerCollage = new ComputerCollage();
        Collage infoCollage = new InfoCollage();
        collageArrayList.add(computerCollage);
        collageArrayList.add(infoCollage);
        CollageImpl collageImpl = new CollageImpl(collageArrayList);
        collageImpl.printCollage();

    }
}
