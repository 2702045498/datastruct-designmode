package com.bange.designmode.designmode.prototype.deepclone;

public class DeepCloneDemo {
    public static void main(String[] args) throws  Exception{
        Variety variety = new Variety(1001, "黑山羊");
        Sheep sheep = new Sheep("tom", 1, "白色", variety);
//        Sheep sheep1 = sheep.clone();
//        System.out.println(sheep1);
        Sheep sheep2 = sheep.deepClone();
        System.out.println(sheep2);

    }
}
