package com.wxz.service;

import com.wxz.entity.User;

import java.util.List;

/**
 * @IDE : Intellij IDEA
 * @Author : Wu Xianzhi
 * @Date : 2019/10/14
 * @Time : 18:06
 * @Version : 1.0
 */
public interface UserService {

    public List<User> delUser(List<User> list, int id);

    public void upaUser(List<User> list, User user, int id);
}
