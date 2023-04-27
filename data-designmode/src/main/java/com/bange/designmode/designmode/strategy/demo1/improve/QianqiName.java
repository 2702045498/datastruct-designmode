package com.bange.designmode.designmode.strategy.demo1.improve;


/**
 * 策略实现类
 */
public class QianqiName implements NameService {
    @Override
    public String getName(SysUser sysUser) {
        sysUser.setUserName("qianqi");
        sysUser.setId(7);
        return "Qianqi";
    }
}
