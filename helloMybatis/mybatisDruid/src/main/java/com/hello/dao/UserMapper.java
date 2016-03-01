package com.hello.dao;

import com.hello.entity.User;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper extends BaseMapper<User, Integer> {

    @Select("select * from user")
    @ResultType(value = com.hello.entity.User.class)
    List<User> getAll();

}