package com.bange.designmode.designmode.prototype.clone;



public class PrototypeDemo {
    public static void main(String[] args) throws Exception {
        // 创建10只一样的羊
        Sheep sheep = new Sheep("tom", 1, "白色");
        Sheep cloneSheep=null;
        for (int i = 1; i <= 10; i++) {
            // 使用原型模式--克隆
            cloneSheep = sheep.clone();
            System.out.println(sheep);
        }


    }
}
