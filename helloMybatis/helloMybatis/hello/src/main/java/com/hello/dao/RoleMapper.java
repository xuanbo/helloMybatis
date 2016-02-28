package com.hello.dao;

import com.hello.entity.Role;

import java.util.List;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);


    List<Role> getByUserId(Integer userId);

    List<Role> getRolesByUserRoleTableOfUserId(Integer userId);
}