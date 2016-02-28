package com.hello.dao;

import java.io.Serializable;

/**
 * Created by xuan on 2016/2/28.
 */

/**
 * BaseMapper接口
 * @param <T>
 * @param <ID>
 */
public interface BaseMapper<T, ID extends Serializable> {

    int deleteByPrimaryKey(ID id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(ID id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
