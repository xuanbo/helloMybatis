package com.hello.service.impl;

import com.hello.dao.UserMapper;
import com.hello.entity.User;
import com.hello.entity.UserCustomer;
import com.hello.entity.UserDetail;
import com.hello.entity.UserInfo;
import com.hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by xuan on 2016/2/23.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public User getById(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int deleteById(int id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<User> getByPage(int currentPage, int pageSize) {
        return userMapper.getByPage((currentPage - 1) * pageSize, pageSize);
    }

    @Override
    public List<User> get(User user) {
        return userMapper.get(user);
    }

    @Override
    public List<User> getByIds(List<Integer> ids) {
        return userMapper.getByIds(ids);
    }

    @Override
    public List<User> getByRole(String roleName) {
        return userMapper.getByRole(roleName);
    }

    @Override
    public List<UserInfo> getUserInfoByRole(String roleName) {
        return userMapper.getUserInfoByRole(roleName);
    }

    @Override
    public List<UserCustomer> getUserInfoByRoleResultMap(String roleName) {
        return userMapper.getUserInfoByRoleResultMap(roleName);
    }

    @Override
    public List<UserDetail> getUserDetail() {
        return userMapper.getUserDetail();
    }

    @Override
    public List<User> getALlByAnnotation() {
        return userMapper.getALlByAnnotation();
    }
}
