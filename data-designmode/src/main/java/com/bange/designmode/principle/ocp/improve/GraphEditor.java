package com.bange.designmode.principle.ocp.improve;

/**
 * 1.开闭原则（OCP原则）
 * 2.引用抽象类
 * 3.GraphEditor代表使用方，当增加其他图形时，无需修改。
 * 只需增加图形类型即可，扩展类，即是框架的扩展，修改关闭
 *
 */
public class GraphEditor {
   public void drawShape(Shape s){
        s.draw();
    }
}
