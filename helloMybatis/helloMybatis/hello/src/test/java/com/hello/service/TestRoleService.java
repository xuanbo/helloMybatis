package com.hello.service;

import com.hello.entity.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by xuan on 2016/2/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/mybatis/spring/spring-mybatis.xml"})
public class TestRoleService {

    @Autowired
    @Qualifier("roleService")
    private RoleService roleService;

    @Test
    public void getByUserId(){
        List<Role> roles = roleService.getByUserId(1);
        for (Role role : roles){
            System.out.println("id:" + role.getId() + " name:" + role.getName());
        }
    }

    @Test
    public void getRolesByUserRoleTableOfUserId(){
        List<Role> roles = roleService.getRolesByUserRoleTableOfUserId(1);
        for (Role role : roles){
            System.out.println("id:" + role.getId() + " name:" + role.getName());
        }
    }
}
