package com.bange.designmode.designmode.responsibility;

import java.math.BigDecimal;
// 采购请求类
public class PurchaseRequest {
    int type; //采购类型
    BigDecimal price;
    int id; // 第几个请求

    public PurchaseRequest(int type, BigDecimal price, int id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
