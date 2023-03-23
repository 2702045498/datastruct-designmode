package com.bange.designmode.designmode.factory.simplefactory;


// 简单工厂模式（静态工厂模式）
public class SimpleFactory {
    public Product creatProduct(int orderType){
     Product product=null;
        if(orderType==1){
            product=new Phone(1,"iphone");
        } else if (orderType==2) {
            product=new Cloth(2,"cloth");
        } else if (orderType==3) {
            product= new CatFood(3,"catfood");
        }
        return product;
    }

    // 静态方法
    public static Product creat(int orderType){
        Product product=null;
        if(orderType==1){
            product=new Phone(1,"iphone");
        } else if (orderType==2) {
            product=new Cloth(2,"cloth");
        } else if (orderType==3) {
            product= new CatFood(3,"catfood");
        }
        return product;
    }

}
