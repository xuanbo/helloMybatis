package com.hello.dao;

import com.hello.entity.Log;
import com.hello.entity.User;

import java.util.List;

public interface LogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Log record);

    int insertSelective(Log record);

    Log selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Log record);

    int updateByPrimaryKey(Log record);


    /**
     * 自定义接口
     */
    List<User> getAll();
}