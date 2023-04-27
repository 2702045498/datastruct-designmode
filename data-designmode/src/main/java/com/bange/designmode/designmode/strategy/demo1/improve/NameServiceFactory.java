package com.bange.designmode.designmode.strategy.demo1.improve;

import java.util.HashMap;
import java.util.Map;

/**
 * 工厂类
 */
public class NameServiceFactory {
    private static final Map<String, NameService> map = new HashMap<>();
    static {
        map.put("zhangsan", new ZhangsanName());
        map.put("lisi", new LisiName());
        map.put("wangwu", new WangwuName());
        map.put("zhaoliu", new ZhaoliuName());
        map.put("qianti", new QianqiName());
    }

    public static NameService getNameService(String name){
        return map.get(name);
    }

}
