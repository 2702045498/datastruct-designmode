package com.bange.designmode.juc.completefuture.entity;

import java.io.Serializable;

public class Commodity implements Serializable {
    private Integer id;
    private String name;

    public Commodity() {
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Commodity{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Commodity(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
