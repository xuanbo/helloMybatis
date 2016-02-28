package com.hello.service.impl;

import com.hello.dao.UserMapper;
import com.hello.entity.User;
import com.hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xuan on 2016/2/28.
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User, Integer> implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }
}
