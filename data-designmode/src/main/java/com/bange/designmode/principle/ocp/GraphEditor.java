package com.bange.designmode.principle.ocp;
/**
 * 1.这种引用对象违反开闭原则（OCP原则）
 * 2.因为增加一种图形，就得在GraphEditor类中增加相应的绘制方法，需要修改GraphEditor类的源码
 * @param
 */
public class GraphEditor {

   public void drawShape(Shape s){
        if(s.getShapetType()==1){
            drawRectangle();
        }else if(s.getShapetType()==2){
            drawCircle();
        }
    }
    public void drawRectangle(){
        System.out.println("绘制矩形");
    }
    public void drawCircle(){
        System.out.println("绘制圆形");
    }
}
