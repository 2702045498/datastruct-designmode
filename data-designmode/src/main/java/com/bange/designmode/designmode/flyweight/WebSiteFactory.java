package com.bange.designmode.designmode.flyweight;

import java.util.HashMap;
import java.util.Map;

// 享元模式--工厂池类
public class WebSiteFactory {
    private Map<String, ConcreateWebSite> pool = new HashMap<>();

    public WebSite getWebSite(String type) {
        if (!pool.containsKey(type)) {
            //没有则创建一个对象放入池中
            pool.put(type, new ConcreateWebSite(type));
        }
        return (WebSite) pool.get(type);
    }

    // 获取总数
    public int getCount() {
        return pool.size();
    }

}
