package com.wxz.test;

import com.wxz.entity.Meeting;
import com.wxz.entity.User;
import com.wxz.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @IDE : Intellij IDEA
 * @Author : Wu Xianzhi
 * @Date : 2019/10/14
 * @Time : 18:13
 * @Version : 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class) // 使用junit4进行测试
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
// 加载配置文件
public class Demo {
    @Autowired
    private UserService userService;

    @Test
    public void main(String[] args) {
        List<User> list = new ArrayList<User>();
        list.add(new User(1, "测试一", "男"));
        list.add(new User(2, "测试二", "男"));
        list.add(new User(3, "测试三", "男"));
        System.out.println(list);
        System.out.println(userService.delUser(list, 1));
    }

    @Test
    public void upatest() {
        List<User> list = new ArrayList<User>();
        list.add(new User(1, "测试一", "男"));
        list.add(new User(2, "测试二", "男"));
        list.add(new User(3, "测试三", "男"));

        System.out.println(list);
        userService.upaUser(list, new User(2, "测试四", "女"), 2);
        System.out.println(list);
    }

    @Test
    public void meetingDemo() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath" +
                ":applicationContext.xml");
        Meeting meeting = (Meeting) ac.getBean("meeting");
        System.out.println(meeting);
    }
    // @Test
    // public void deltest() {
    //
    // List<User> list= new ArrayList<User>();
    // list.add(new User(1,"测试一","男"));
    // list.add(new User(2,"测试二","男"));
    // list.add(new User(3,"测试三","男"));
    // System.out.println(list);
    // userService.delUser(list,1);
    // System.out.println(list);
    // }
}