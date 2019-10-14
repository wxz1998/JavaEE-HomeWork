package com.wxz.entity;

/**
 * @IDE : Intellij IDEA
 * @Author : Wu Xianzhi
 * @Date : 2019/10/14
 * @Time : 18:04
 * @Version : 1.0
 */
public class Cars {
    public void main(String[] args) {
    }

    private String brand;
    private String color;
    private String displacement;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    @Override
    public String toString() {
        return "Cars [brand=" + brand + ", color=" + color + ", displacement" +
                "=" + displacement + "]";
    }
}