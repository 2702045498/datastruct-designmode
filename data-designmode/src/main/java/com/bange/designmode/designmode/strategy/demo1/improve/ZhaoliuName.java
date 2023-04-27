package com.bange.designmode.designmode.strategy.demo1.improve;



public class ZhaoliuName implements NameService {
    @Override
    public String getName(SysUser sysUser) {
        sysUser.setUserName("zhaoliu");
        sysUser.setId(6);
        System.out.println(sysUser.toString());
        return "zhaoliu";
    }
}
