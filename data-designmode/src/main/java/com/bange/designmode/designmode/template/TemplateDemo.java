package com.bange.designmode.designmode.template;

public class TemplateDemo {
    public static void main(String[] args) {
        // 制作红豆将
        AbstractSoyMilk redBeanSoyMilk = new RedBeanSoyMilk();
        redBeanSoyMilk.make();
        AbstractSoyMilk peanatSoyMilk = new PeanatSoyMilk();
        peanatSoyMilk.make();

        AbstractSoyMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();
    }
}
