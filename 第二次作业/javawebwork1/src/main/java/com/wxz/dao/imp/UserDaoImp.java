package com.wxz.dao.imp;

import com.wxz.dao.UserDao;
import com.wxz.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @IDE : Intellij IDEA
 * @Author : Wu Xianzhi
 * @Date : 2019/10/14
 * @Time : 17:57
 * @Version : 1.0
 */
@Repository("userDao")
public class UserDaoImp implements UserDao {
    public void main(String[] args) {
    }

    @Override
    public List<User> delUser(List<User> list, int id) {
        // TODO Auto-generated method stub
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {

                if (list.get(i).getId() == id) {
                    list.remove(i);
                    break;
                }
            }
        }

        System.out.println("test1");

        return list;
    }

    @Override
    public void upaUser(List<User> list, User user, int id) {
        // TODO Auto-generated method stub
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId() == id) {
                    list.set(i, user);
                    break;
                }
            }
        }

    }
}