package com.bange.designmode.designmode.flyweight;

public class ConcreateWebSite  extends WebSite{
    // 享元模式共享的内部状态
    private String type; //发布类型
    public ConcreateWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println(user.getName()+"网站发布形式为"+type);
    }
}
