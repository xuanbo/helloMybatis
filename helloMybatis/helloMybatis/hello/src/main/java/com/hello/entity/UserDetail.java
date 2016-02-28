package com.hello.entity;

import java.util.List;

/**
 * Created by xuan on 2016/2/26.
 */

/**
 * 用户详情，包含对应多个role
 */
public class UserDetail extends User {
    private List<Role> roles;

    public UserDetail() {
    }

    public UserDetail(List<Role> roles) {
        this.roles = roles;
    }

    public UserDetail(String name, Integer id, String password, List<Role> roles) {
        super(name, id, password);
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
