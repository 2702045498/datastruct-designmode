package com.bange.designmode.designmode.decorate;

import java.math.BigDecimal;
// 单品咖啡
public class Coffee  extends  Drink{
    @Override
    public BigDecimal cost() {
        return super.getPrice();
    }
}
