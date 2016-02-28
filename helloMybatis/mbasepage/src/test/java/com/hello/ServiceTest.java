package com.hello;

import com.hello.entity.User;
import com.hello.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by xuan on 2016/2/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/mybatis/spring/spring-mybatis.xml"})
public class ServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void get(){
        System.out.println("username:" + userService.selectByPrimaryKey(1).getUsername());
    }

    @Test
    public void getAll(){
        List<User> users = userService.getAll();
        for (User  user : users){
            System.out.println("id:" + user.getId() + " username:" + user.getUsername()
            + " roleid:" + user.getRoleid());
            //由于mapper接口中使用的注解没有映射属性Role,所以值为null
            System.out.println(user.getRole());
        }
    }
}
