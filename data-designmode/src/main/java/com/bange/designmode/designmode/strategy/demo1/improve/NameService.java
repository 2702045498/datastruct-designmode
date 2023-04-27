package com.bange.designmode.designmode.strategy.demo1.improve;

/**
 * 每个条件逻辑代码块，抽象成一个公共的接口
 * 我们根据每个逻辑条件，定义相对应的策略实现类
 */
public interface NameService {
    String getName(SysUser sysUser);
}
