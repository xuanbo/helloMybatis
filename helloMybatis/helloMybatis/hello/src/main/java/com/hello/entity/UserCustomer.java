package com.hello.entity;

/**
 * Created by xuan on 2016/2/26.
 */

/**
 * 扩展用户对象（使用resultMap）
 */
public class UserCustomer {

    private Integer id;

    private String name;

    private String password;

    private Role role;

    public UserCustomer() {
    }

    public UserCustomer(Integer id, String password, String name, Role role) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
