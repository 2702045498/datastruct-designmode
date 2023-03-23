package com.bange.designmode.designmode.combination;

public class CombinationDemo {

    public static void main(String[] args) {
        // 创建大学
        Organization university = new University("北京大学","中国最好的大学");
        // 创建学院
        Organization collage = new Collage("计算机学院","计算机相关专业的学院");
        Organization collage1 = new Collage("矿业学院","学习采矿工程的学院");
        // 创建专业
        Organization department = new Department("计算机应用","计算机应用方面专业");
        Organization department1 = new Department("软件工程","软件开发方面专业");
        Organization department2 = new Department("采矿专业","采矿挖掘");
        Organization department3 = new Department("冶金工程","采矿分析");

        // 构建组织
        university.add(collage);
        university.add(collage1);

        collage.add(department);
        collage.add(department1);
        collage1.add(department2);
        collage1.add(department3);

        university.print();
        collage.print();

        System.out.println(university);
    }
}
