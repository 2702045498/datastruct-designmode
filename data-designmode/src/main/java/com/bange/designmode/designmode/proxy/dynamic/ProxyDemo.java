package com.bange.designmode.designmode.proxy.dynamic;


public class ProxyDemo {
    public static void main(String[] args) {
        // 目标对象
        ITeacherDao teacherDao = new TeacherDao();
        // 代理对象
        ProxyFactory proxyFactory = new ProxyFactory(teacherDao);
        ITeacherDao proxyInstance = (ITeacherDao)proxyFactory.getProxyInstance();
        proxyInstance.teach();
    }
}
