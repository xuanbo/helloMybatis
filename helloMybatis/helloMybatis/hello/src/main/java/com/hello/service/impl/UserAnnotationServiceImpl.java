package com.hello.service.impl;

import com.hello.dao.UserDao;
import com.hello.entity.User;
import com.hello.entity.UserDetail;
import com.hello.service.UserAnnotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xuan on 2016/2/27.
 */
@Service("userAnnotationService")
public class UserAnnotationServiceImpl implements UserAnnotationService{

    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public User getById(int id) {
        return userDao.getById(id);
    }

    @Override
    public List<UserDetail> getAllUserDetail() {
        return userDao.getAllUserDetail();
    }

    @Override
    public int insert(User user) {
        return userDao.insert(user);
    }

    @Override
    public int update(User user) {
        return userDao.update(user);
    }

    @Override
    public int deleteById(int id) {
        return userDao.deleteById(id);
    }
}
