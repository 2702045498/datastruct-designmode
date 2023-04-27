package com.bange.designmode.juc.completefuture.entity;

import java.io.Serializable;

public class Stock implements Serializable {
    private Integer id;
    private Integer commodityId;
    private Integer count;

    public Stock() {
    }

    public Stock(Integer id, Integer commodityId, Integer count) {
        this.id = id;
        this.commodityId = commodityId;
        this.count = count;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Stock{");
        sb.append("id=").append(id);
        sb.append(", commodityId=").append(commodityId);
        sb.append(", count=").append(count);
        sb.append('}');
        return sb.toString();
    }
}
