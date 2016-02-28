package com.hello.service;

import com.hello.entity.*;
import org.apache.ibatis.session.RowBounds;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.*;

/**
 * Created by xuan on 2016/2/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/mybatis/spring/spring-mybatis.xml"})
public class TestUserService {

    private Logger logger = Logger.getLogger(TestUserService.class);


    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;


    @Test
    public void getById(){
        System.out.println(userService.getById(1).getName());
    }

    @Test
    public void getAll(){
        List<User> list = userService.getAll();
        for (User user : list){
            System.out.println("id:" + user.getId() + " name:" + user.getName());
        }
    }

    @Test
    public void getByPage(){
        int currentPage = 2;
        int pageSize = 3;
        List<User> users = userService.getByPage(currentPage, pageSize);
        for (User user : users){
            System.out.println("id:" + user.getName() + " name:" + user.getName());
        }
    }

    @Test
    public void save(){
        User user = new User();
        user.setName("yyq");
        user.setPassword("520");
        System.out.println("插入前的Id:" + user.getId());
        System.out.println(userService.insertSelective(user));
        System.out.println("插入后的id:" + user.getId());
    }

    @Test
    public void update(){
        User user = userService.getById(2);
        //user.setName("22");
        userService.updateByPrimaryKeySelective(user);
    }

    @Test
    public void get(){
        User user = new User();
        //user.setId(1);
        user.setName("yyq");
        user.setPassword("111111");
        List<User> users = userService.get(user);
        for (User u : users){
            System.out.println("id:" + u.getId() + " name:" + u.getName() + " password:" + u.getPassword());
        }
    }

    @Test
    public void getByIds(){
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
//        ids.add(5);
//        ids.add(9);
        List<User> users = userService.getByIds(ids);
        for (User u : users){
            System.out.println("id:" + u.getId() + " name:" + u.getName() + " password:" + u.getPassword());
        }
    }

    @Test
    public void getByRole(){
        String roleName = "user";
        List<User> users = userService.getByRole(roleName);
        for (User u : users){
            System.out.println("id:" + u.getId() + " name:" + u.getName() + " password:" + u.getPassword());
        }
    }

    @Test
    public void getUserInfoByRole(){
        String roleName = "user";
        List<UserInfo> users = userService.getUserInfoByRole(roleName);
        for (UserInfo u : users){
            System.out.println("id:" + u.getId() + " name:" + u.getName() + " password:" + u.getPassword()
                    + " roleName:" + u.getRoleName());
        }
    }

    @Test
    public void getUserCustomerByRole(){
        String roleName = "admin";
        List<UserCustomer> users = userService.getUserInfoByRoleResultMap(roleName);
        for (UserCustomer u : users){
            System.out.println("id:" + u.getId() + " name:" + u.getName() + " password:" + u.getPassword()
                    + " roleName:" + u.getRole().getName() + " roleId:" + u.getRole().getId());
        }
    }


    @Test
    public void getUserDetail() throws Exception{
        List<UserDetail> userDetails = userService.getUserDetail();
        for (UserDetail userDetail : userDetails){
            System.out.println("id:" + userDetail.getId() + " name:" + userDetail.getName() + " password:"
                    + userDetail.getPassword());
            List<Role> roles = userDetail.getRoles();
            for (Role role : roles){
                System.out.println("roleId:" + role.getId() + " roleName:" + role.getName());
            }
            System.out.println("-------------");
        }
    }

    @Test
    public void getUserByAnnotation(){
        List<User> users = userService.getALlByAnnotation();
        for (User user : users){
            System.out.println("id:" + user.getId() + " name:" + user.getName());
        }
    }
}
