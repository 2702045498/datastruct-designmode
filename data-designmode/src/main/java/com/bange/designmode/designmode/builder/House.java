package com.bange.designmode.designmode.builder;

/**
 * 产品--房子
 */
public class House {
    private String base; // 基础
    private String wall; // 强
    private String rootf; // 封顶

    public House() {
    }

    public House(String base, String wall, String rootf) {
        this.base = base;
        this.wall = wall;
        this.rootf = rootf;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("House{");
        sb.append("base='").append(base).append('\'');
        sb.append(", wall='").append(wall).append('\'');
        sb.append(", rootf='").append(rootf).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRootf() {
        return rootf;
    }

    public void setRootf(String rootf) {
        this.rootf = rootf;
    }
}
