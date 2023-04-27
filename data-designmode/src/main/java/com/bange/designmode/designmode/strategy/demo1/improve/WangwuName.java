package com.bange.designmode.designmode.strategy.demo1.improve;



public class WangwuName implements NameService {
    @Override
    public String getName(SysUser sysUser) {
        sysUser.setUserName("wangwu");
        sysUser.setId(5);
        return "Wangwu";
    }
}
