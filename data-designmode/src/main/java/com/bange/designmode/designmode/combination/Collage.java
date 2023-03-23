package com.bange.designmode.designmode.combination;

import java.util.ArrayList;
import java.util.List;
// 学院
public class Collage  extends Organization{
    // 所指的对象是Department 子节点
    private List<Organization> organizationList=new ArrayList<>();

    public Collage(String name, String desc) {
        super(name, desc);
    }

    @Override
    public void add(Organization organization) {
        organizationList.add(organization);
    }

    @Override
    public void remove(Organization organization) {
        organizationList.remove(organization);
    }

    @Override
    public void print() {
        System.out.println("------"+getName()+"-------");
        for (Organization org:organizationList){
            org.print();
        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Collage{");
        sb.append("organizationList=").append(organizationList);
        sb.append('}');
        return sb.toString();
    }
}
