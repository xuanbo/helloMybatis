package com.hello.dySql;

/**
 * Created by xuan on 2016/2/27.
 */

import com.hello.entity.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.jdbc.SQL;

import java.util.Set;

/**
 * user表动态sql
 */
public class UserSqlProvider {

    /**
     * 使用字符串拼接很容易出错，不推荐，建议是用mybatis提供的sql工具类
     * @param id
     * @return
    public String getById(int id){
        return new String("select * from user where id = ") + id;
    }
     */

    public String getById(final int id){
        return new SQL(){
            {
                SELECT("u.*");
                FROM("user u");
                WHERE("id = " + id);
            }
        }.toString();
    }

    /**
     * 查询userDetail
     * resultMap进行映射时，要仔细检查报表的列名，否则无法进行映射
     * @return
     */
    public String getAllUserDetail(){
        return new SQL(){
            {
                SELECT("u.*, r.id as roleId, r.name as roleName");
                FROM("user u, userrole ur, role r");
                WHERE("u.id = ur.userId and ur.roleId = r.id");
            }
        }.toString();
    }


    /**
     * 插入动态sql
     * @param user
     * #{name}等参数要跟user对象中的属性值一致，不然无法通过getter或setter方法获取或者注入
     * @return
     */
    public String insert(final User user){
        return new SQL(){
            {
                INSERT_INTO("user");
                if (user.getId() != null){
                    VALUES("id", "#{id}");
                }
                if (user.getName() != null){
                    VALUES("name", "#{name}");
                }
                if (user.getPassword() != null){
                    VALUES("password", "#{password}");
                }
            }
        }.toString();
    }


    /**
     * update动态sql
     * @param user
     * @return
     */
    public String update(final User user){
        return new SQL(){
            {
                UPDATE("user");
                if (user.getName() != null){
                    SET("name = #{name}");
                }
                if (user.getPassword() != null){
                    SET("password = #{password}");
                }
            }
        }.toString();
    }

    /**
     * 根据id删除动态sql
     * @param id
     * @return
     */
    public String deleteById(final int id){
        return new SQL(){
            {
                DELETE_FROM("user");
                WHERE("id = #{id}");
            }
        }.toString();
    }
}
