package com.wxz.service.imp;

import com.wxz.dao.UserDao;
import com.wxz.entity.User;
import com.wxz.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @IDE : Intellij IDEA
 * @Author : Wu Xianzhi
 * @Date : 2019/10/14
 * @Time : 18:07
 * @Version : 1.0
 */
@Service("userService")
public class UserServiceImp implements UserService {
    public void main(String[] args) {
    }

    @Resource
    UserDao userDao;

    @Override
    public List<User> delUser(List<User> list, int id) {
        // TODO Auto-generated method stub
        return userDao.delUser(list, id);
    }

    @Override
    public void upaUser(List<User> list, User user, int id) {
        // TODO Auto-generated method stub
        userDao.upaUser(list, user, id);
    }
}