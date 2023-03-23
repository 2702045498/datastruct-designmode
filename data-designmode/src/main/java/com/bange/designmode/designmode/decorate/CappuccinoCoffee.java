package com.bange.designmode.designmode.decorate;

import java.math.BigDecimal;

//拿铁咖啡
public class CappuccinoCoffee extends Coffee{
    public CappuccinoCoffee() {
        setDescript("拿铁咖啡");
        setPrice(BigDecimal.valueOf(80.00));
    }
}
