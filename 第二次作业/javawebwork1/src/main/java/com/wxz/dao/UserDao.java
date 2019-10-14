package com.wxz.dao;

import com.wxz.entity.User;

import java.util.List;

/**
 * @IDE : Intellij IDEA
 * @Author : Wu Xianzhi
 * @Date : 2019/10/14
 * @Time : 17:55
 * @Version : 1.0
 */
public interface UserDao {
    public List<User> delUser(List<User> list, int id);

    public void upaUser(List<User> list, User user, int id);
}
