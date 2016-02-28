package com.hello;


import com.hello.dao.RoleMapper;
import com.hello.dao.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/mybatis/spring/spring-mybatis.xml"})
public class AppTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Test
    public void get(){
        System.out.println("username:" + userMapper.selectByPrimaryKey(1).getUsername());
        System.out.println("rolename:" + roleMapper.selectByPrimaryKey(1).getRolename());
    }
}
