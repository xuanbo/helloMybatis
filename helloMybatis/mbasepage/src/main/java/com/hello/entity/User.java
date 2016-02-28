package com.hello.entity;

/**
 * 用户实体
 */
public class User {
    private Integer id;

    private String username;

    private Integer telephonenumber;

    private String password;

    //外键，关联角色的id（role.id）
    private Integer roleid;

    private Role role;

    public User() {
    }

    public User(Integer id, String username, Integer telephonenumber,
                String password, Integer roleid, Role role) {
        this.id = id;
        this.username = username;
        this.telephonenumber = telephonenumber;
        this.password = password;
        this.roleid = roleid;
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getTelephonenumber() {
        return telephonenumber;
    }

    public void setTelephonenumber(Integer telephonenumber) {
        this.telephonenumber = telephonenumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}