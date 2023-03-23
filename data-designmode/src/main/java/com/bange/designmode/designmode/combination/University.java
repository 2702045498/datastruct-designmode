package com.bange.designmode.designmode.combination;

import java.util.ArrayList;
import java.util.List;
// 叶子节点
public class University  extends  Organization{
    // 组合叶子对象
    private List<Organization> organizationList=new ArrayList<>();

    public University(String name, String desc) {
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
        final StringBuffer sb = new StringBuffer("University{");
        sb.append("organizationList=").append(organizationList);
        sb.append('}');
        return sb.toString();
    }
}
