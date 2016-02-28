package com.hello.entity;

import java.util.List;

public class Role {
    private Integer id;

    private String rolename;

    private String description;

    private List<User> users;

    public Role() {
    }

    public Role(Integer id, String rolename, String description, List<User> users) {
        this.id = id;
        this.rolename = rolename;
        this.description = description;
        this.users = users;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}