package com.bange.designmode.designmode.prototype.general;

public class PrototypeDemo {
    public static void main(String[] args) {
        // 创建10只一样的羊
        for (int i = 1; i <= 10; i++) {
            Sheep sheep = new Sheep("tom", 1, "白色");
            System.out.println(sheep);
        }


    }
}
