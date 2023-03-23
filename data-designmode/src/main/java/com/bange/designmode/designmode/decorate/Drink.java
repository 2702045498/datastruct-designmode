package com.bange.designmode.designmode.decorate;

import java.math.BigDecimal;
// 抽线类
public abstract class Drink {
    private String descript;
    private BigDecimal price;
        // 计算费用
    public abstract BigDecimal cost();

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
