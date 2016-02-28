package com.hello.service;

/**
 * Created by xuan on 2016/2/27.
 */

import com.hello.entity.User;
import com.hello.entity.UserDetail;

import java.util.List;

/**
 * ʹ��ע���userDao�ӿڵ�ҵ���߼��ӿ�
 */
public interface UserAnnotationService {

    List<User> getAll();

    User getById(int id);

    List<UserDetail> getAllUserDetail();

    int insert(User user);

    int update(User user);

    int deleteById(int id);

}
