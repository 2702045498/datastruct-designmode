package com.bange.designmode.designmode.strategy.demo1;
/**
 *多条件逻辑判断的案例：使用策略模式+工厂模式来优化
 */
public class AppTest {
    public static void main(String[] args) {
        String name = "zhangsan";
        if ("lisi".equals(name)) {
            System.out.println("==>李四");
        } else if ("zhangsan".equals(name)) {
            System.out.println("==>张三");
        } else if ("wangwu".equals(name)) {
            System.out.println("==>王五");
        } else if ("zhaoliu".equals(name)) {
            System.out.println("==>找刘");
        } else {
            System.out.println("==>田七");
        }
    }
}
