package com.bange.designmode.designmode.factory.general;

public class Order {
    int orderType=0;

    // 1.传统方式--使用处根据条件创建对象
    public void placeOrder(){
        Product product=null;
        if(this.orderType==1){
            product=new Phone(1,"iphone");
        } else if (this.orderType==2) {
            product=new Cloth(2,"cloth");
        } else if (this.orderType==3) {
           product= new CatFood(3,"catfood");
        }
        product.production();
        product.deliverGoods();
    }



    public int getOrderType() {
        return orderType;
    }

    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }
}
