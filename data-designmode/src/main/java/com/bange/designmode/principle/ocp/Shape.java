package com.bange.designmode.principle.ocp;

public class Shape {
    private   int ShapetType;



    public int getShapetType() {
        return ShapetType;
    }

    public void setShapetType(int shapetType) {
        ShapetType = shapetType;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Shape{");
        sb.append("ShapetType=").append(ShapetType);
        sb.append('}');
        return sb.toString();
    }
}
