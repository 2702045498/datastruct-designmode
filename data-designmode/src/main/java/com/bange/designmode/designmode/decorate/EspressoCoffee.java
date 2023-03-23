package com.bange.designmode.designmode.decorate;

import java.math.BigDecimal;

// 单品--意大利咖啡
public class EspressoCoffee extends  Coffee{
    public EspressoCoffee() {
        setDescript("意大利咖啡");
        setPrice(BigDecimal.valueOf(65.00));
    }
}
