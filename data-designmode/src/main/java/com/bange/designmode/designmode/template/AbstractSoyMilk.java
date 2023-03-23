package com.bange.designmode.designmode.template;
// 模版方法模式--多个类中相同方法放在模版方法中
public abstract class AbstractSoyMilk {

    // 模版方法 final修饰，防止子类覆盖
    final void make() {
        select();
        //钩子函数
        if(isCondiment()){
            addCondiment();
        }
        soyk();
        beat();
    }

    void select() {
        System.out.println("1.选料");
    }

    // 抽象方法：每种口味的不一样由子类实现
    abstract void addCondiment();

    void soyk(){
        System.out.println("3.浸泡");
    }
    void  beat(){
        System.out.println("4.打豆浆");
    }
    // 钩子函数--是否需要配料
    boolean isCondiment(){
        return true;
    }

}
