package com.bange.designmode.designmode.proxy.staticproxy;

// 代理对象
public class TeacherDaoProxy  implements  ITeacherDao{
    // 目标对象，通过接口来聚合
    private  ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("代理开始------");
        target.teach();
        System.out.println("代理结束------");
    }
}
