package com.bange.designmode.designmode.proxy.staticproxy;

public class ProxyDemo {
    public static void main(String[] args) {
        // 目标对象
        TeacherDao teacherDao = new TeacherDao();
        // 代理对象
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        // 代理对象调用目标对象的方法
        teacherDaoProxy.teach();
    }
}
