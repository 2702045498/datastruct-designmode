package com.bange.designmode.designmode.strategy.demo1.improve;

public class DemoApp {
    public static void main(String[] args) {
        String[] arr={"zhangsan","lisi","wangwu","zhaoliu","qianti",};
        SysUser sysUser = new SysUser();
        for (int i = 0; i < arr.length ; i++) {
            NameService name = NameServiceFactory.getNameService(arr[i]);
            System.out.println("=优化=>"+name.getName(sysUser));
        }


    }
}
