package com.wxz.entity;

/**
 * @IDE : Intellij IDEA
 * @Author : Wu Xianzhi
 * @Date : 2019/10/14
 * @Time : 18:04
 * @Version : 1.0
 */
public class Boss {
    public void main(String[] args) {
    }

    private String name;
    private String company;
    private String hobby;
    private Cars cars;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Cars getCars() {
        return cars;
    }

    public void setCars(Cars cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Boss [name=" + name + ", company=" + company + ", hobby=" + hobby + ", cars=" + cars + "]";
    }
}