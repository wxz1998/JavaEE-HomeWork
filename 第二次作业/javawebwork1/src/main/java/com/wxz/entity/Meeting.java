package com.wxz.entity;

import java.util.List;

/**
 * @IDE : Intellij IDEA
 * @Author : Wu Xianzhi
 * @Date : 2019/10/14
 * @Time : 18:05
 * @Version : 1.0
 */
public class Meeting {
    public void main(String[] args) {
    }

    private String theme;
    private List<Boss> list;

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public List<Boss> getList() {
        return list;
    }

    public void setList(List<Boss> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Meeting [theme=" + theme + ", list=" + list + "]";
    }
}