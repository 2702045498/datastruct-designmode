package com.bange.designmode.juc.completefuture.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

public class SysUser implements Serializable {
    private Integer id;
    private String userName;
    private String email;
    private Integer age;
    private LocalDateTime createTime;

    public SysUser() {
    }

    public SysUser(Integer id, String userName, String email, Integer age, LocalDateTime createTime) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.age = age;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SysUser{");
        sb.append("id=").append(id);
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", age=").append(age);
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }
}
