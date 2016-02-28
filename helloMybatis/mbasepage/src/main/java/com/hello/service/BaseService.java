package com.hello.service;

import java.io.Serializable;

/**
 * Created by xuan on 2016/2/28.
 */

/**
 * BaseService½Ó¿Ú
 * @param <T>
 * @param <ID>
 */
public interface BaseService<T, ID extends Serializable> {

    int deleteByPrimaryKey(ID id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(ID id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
