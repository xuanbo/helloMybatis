package com.hello.dao;

import com.hello.entity.User;
import com.hello.entity.UserCustomer;
import com.hello.entity.UserDetail;
import com.hello.entity.UserInfo;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userMapper")
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

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

    @Select("select * from user")
    List<User> getALlByAnnotation();
}