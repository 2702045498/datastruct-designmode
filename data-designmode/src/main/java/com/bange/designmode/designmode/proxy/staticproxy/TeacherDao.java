package com.bange.designmode.designmode.proxy.staticproxy;

public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("教师授课中……");
    }
}
