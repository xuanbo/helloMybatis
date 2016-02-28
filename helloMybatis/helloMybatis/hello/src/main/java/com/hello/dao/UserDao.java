package com.hello.dao;

/**
 * Created by xuan on 2016/2/27.
 */

import com.hello.entity.User;
import com.hello.entity.UserDetail;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 1、使用注解来代替mapper.xml
 * 2、通过注解构建动态sql
 */
@Repository("userDao")
public interface UserDao {

    /**
     * @Select("select * from user")
     * List<User> getAll();
     */


    /**
     * Results用来配置返回映射，相当于resultMap
     * @return
     *
    @Select("select * from user")
    @Results({
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "password", property = "password")
    })
    List<User> getAll();
     */

    /**
     * @return
    @Select("select * from user")
    @ResultType(com.hello.entity.User.class)
    List<User> getAll();
     */

    /**
     * 使用ResultMap可以找到mapper接口中对应的mapper.xml定义的resultMap来完成映射
     * @return
     */
    @Select("select * from user")
    @ResultMap("com.hello.dao.UserMapper.BaseResultMap")
    List<User> getAll();

    /**
     * 通过mybatis提供的sql工具类写sql
     * @return
     */
    @SelectProvider(type = com.hello.dySql.UserSqlProvider.class, method = "getById")
    @ResultMap("com.hello.dao.UserMapper.BaseResultMap")
    User getById(int id);


    /**
     * 查询userDetail
     */
    @SelectProvider(type = com.hello.dySql.UserSqlProvider.class, method = "getAllUserDetail")
    @ResultMap("com.hello.dao.UserMapper.BaseUserDetailResultMap")
    List<UserDetail> getAllUserDetail();

    /**
     * option配置主键返回
     * @param user
     * @return
     */
    @InsertProvider(type = com.hello.dySql.UserSqlProvider.class, method = "insert")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(User user);

    @UpdateProvider(type = com.hello.dySql.UserSqlProvider.class, method = "update")
    int update(User user);

    @DeleteProvider(type = com.hello.dySql.UserSqlProvider.class, method = "deleteById")
    int deleteById(int id);
}
