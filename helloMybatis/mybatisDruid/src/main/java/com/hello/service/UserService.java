package com.hello.service;

import com.hello.entity.User;

import java.util.List;

/**
 * Created by xuan on 2016/2/28.
 */
public interface UserService extends BaseService<User, Integer> {

    List<User> getAll();
}
