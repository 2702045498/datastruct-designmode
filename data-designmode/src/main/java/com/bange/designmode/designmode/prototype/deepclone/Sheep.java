package com.bange.designmode.designmode.prototype.deepclone;

import java.io.*;

/**
 *  名称为tom的羊，白色，1岁
 *  clone浅克隆不能克隆对象复杂属性
 */
public class Sheep implements Serializable, Cloneable{
    private String name;
    private int age;
    private  String color;
    private Variety variety; // 品种
    public Sheep(String name, int age, String color,Variety variety) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.variety=variety;
    }
    //实现深克隆方法
    @Override
    protected Sheep clone() throws CloneNotSupportedException {
        Sheep sheep=null;
        sheep=(Sheep)super.clone();
        sheep.variety=(Variety) variety.clone();
        return sheep;
    }

    /**
     * 序列化方式进行深度克隆
     * @return
     */
    public Sheep deepClone(){
        ByteArrayOutputStream bos=null;
        ObjectOutputStream oos=null;
        ByteArrayInputStream bis=null;
        ObjectInputStream ois=null;
        try {
            // 序列化
             bos= new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            // 反序列化
             bis = new ByteArrayInputStream(bos.toByteArray());
             ois = new ObjectInputStream(bis);
            Sheep sheep =(Sheep) ois.readObject();
            return sheep;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        }
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Variety getVariety() {
        return variety;
    }

    public void setVariety(Variety variety) {
        this.variety = variety;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Sheep{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", color='").append(color).append('\'');
        sb.append(", variety=").append(variety);
        sb.append('}');
        return sb.toString();
    }
}
