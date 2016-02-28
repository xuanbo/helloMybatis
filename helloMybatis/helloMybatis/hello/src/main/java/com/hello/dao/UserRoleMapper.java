package com.hello.dao;

import com.hello.entity.UserRole;

public interface UserRoleMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}