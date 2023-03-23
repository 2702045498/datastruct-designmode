package com.bange.designmode.principle.ocp.improve;

public class OCPDemo2 {
    public static void main(String[] args) {
        GraphEditor graphEditor = new GraphEditor();
        graphEditor.drawShape(new Rectangle());
        graphEditor.drawShape(new Circle());
    }
}
