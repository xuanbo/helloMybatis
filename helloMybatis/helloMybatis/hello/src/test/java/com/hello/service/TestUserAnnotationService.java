package com.hello.service;

import com.hello.entity.Role;
import com.hello.entity.User;
import com.hello.entity.UserDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by xuan on 2016/2/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/mybatis/spring/spring-mybatis.xml"})
public class TestUserAnnotationService {

    @Autowired
    private UserAnnotationService userAnnotationService;

    @Test
    public void getAll(){
        List<User> users = userAnnotationService.getAll();
        for (User user : users){
            System.out.println("id:" + user.getId() + " name:" + user.getName());
        }
    }

    @Test
    public void getById(){
        User user = userAnnotationService.getById(1);
        System.out.println("id:" + user.getId() + " name:" + user.getName());
    }

    @Test
    public void getUserDetail(){
        List<UserDetail> userDetails = userAnnotationService.getAllUserDetail();
        for (UserDetail userDetail : userDetails){
            System.out.println("id:" + userDetail.getId() + " name:" + userDetail.getName() + " password:" + userDetail.getPassword() );
            for (Role role : userDetail.getRoles()){
                System.out.println("id:" + role.getId() + " name:" + role.getName());
            }
            System.out.println("---------------------------------------");
        }
    }

    @Test
    public void insert(){
        User user = new User();
        //user.setName("www");
        //user.setPassword("111");
        System.out.println("插入前的id：" + user.getId());
        System.out.println("插入函数的返回值:" + userAnnotationService.insert(user));
        System.out.println("插入后的id:" + user.getId());
    }

    @Test
    public void update(){
        User user = userAnnotationService.getById(2);
        System.out.println("id为2的的用户的name:" + user.getName() + " password:" + user.getPassword());
        user.setName("张三");
        userAnnotationService.update(user);
        System.out.println("跟新后的name:" + user.getName() + " password:" + user.getPassword());

    }

    @Test
    public void deleteById(){
        System.out.println("执行删除后的返回值：" + userAnnotationService.deleteById(30));
    }
}
