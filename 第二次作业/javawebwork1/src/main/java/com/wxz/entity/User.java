package com.wxz.entity;

/**
 * @IDE : Intellij IDEA
 * @Author : Wu Xianzhi
 * @Date : 2019/10/14
 * @Time : 17:59
 * @Version : 1.0
 */
public class User {
    private int id;
    private String name;
    private String sex;

    public User(int id, String name, String sex) {
        super();
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", sex=" + sex + "]";
    }
}
