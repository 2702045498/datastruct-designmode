package com.bange.designmode.designmode.strategy.demo1.improve;

/**
 * 策略实现类
 */
public class ZhangsanName implements NameService {
    @Override
    public String getName(SysUser sysUser) {
        // 业务逻辑
        sysUser.setUserName("zhangsan");
        sysUser.setId(1);
        return "zhangsan";
    }
}
