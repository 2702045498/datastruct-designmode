package com.bange.designmode.designmode.combination;
// 抽象类 ：组织机构
public abstract class Organization {
    private String name;
    private String desc;

    // 子类不一定实现的，写默认实现
    public void add(Organization organization){
        throw  new UnsupportedOperationException("不支持操作");
    }
    public void remove(Organization organization){
        throw  new UnsupportedOperationException("不支持操作");
    }
    //打印操作，所有子类都需要实现
    public abstract void print();

    public Organization() {
    }

    public Organization(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Organization{");
        sb.append("name='").append(name).append('\'');
        sb.append(", desc='").append(desc).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
