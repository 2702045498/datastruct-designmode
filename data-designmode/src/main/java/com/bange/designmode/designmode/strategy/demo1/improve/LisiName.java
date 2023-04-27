package com.bange.designmode.designmode.strategy.demo1.improve;


/**
 * 策略实现类
 */
public class LisiName  implements NameService {
    @Override
    public String getName(SysUser sysUser) {
        sysUser.setUserName("lisi");
        sysUser.setId(4);
        return "Lisi";
    }
}
