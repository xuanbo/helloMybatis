package com.hello.service;


import com.hello.entity.User;
import com.hello.entity.UserCustomer;
import com.hello.entity.UserDetail;
import com.hello.entity.UserInfo;

import java.util.List;

/**
 * Created by xuan on 2016/2/23.
 */
public interface UserService {

    int deleteById(int id);

    int insert(User record);

    int insertSelective(User record);

    User getById(int id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);


    /**
     * 自定义接口
     */
    List<User> getAll();

    List<User> getByPage(int currentPage, int pageSize);

    List<User> get(User user);

    List<User> getByIds(List<Integer> ids);

    List<User> getByRole(String roleName);

    List<UserInfo> getUserInfoByRole(String roleName);

    List<UserCustomer> getUserInfoByRoleResultMap(String roleName);

    List<UserDetail> getUserDetail();

    List<User> getALlByAnnotation();
}
