package com.hello;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

    @Test
    public void getByPageHelper(){
        /**
         * 只有紧跟在PageHelper.startPage方法后的第一个Mybatis的查询（Select方法）方法会被分页。
         */
        PageHelper.startPage(1, 3);
        List<User> users = userService.getAll();
        for (User user : users){
            System.out.println("id:" + user.getId() + " username:" + user.getUsername()
                    + " roleid:" + user.getRoleid());
        }
        System.out.println("-----------------");
        for (User user : userService.getAll()){
            System.out.println("id:" + user.getId() + " username:" + user.getUsername()
                    + " roleid:" + user.getRoleid());
        }
        System.out.println("-----------------");

        /**
         * pageInfo对结果记性包装
         */
        PageHelper.startPage(1, 3);
        PageInfo page = new PageInfo(userService.getAll());
        //结果为原始查询到的总数
        System.out.println(page.getTotal());
        //分页后的容量
        System.out.println(page.getPageSize());
    }
}
