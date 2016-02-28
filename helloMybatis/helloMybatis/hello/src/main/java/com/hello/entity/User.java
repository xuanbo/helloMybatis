package com.hello.entity;


/**
 * @Alias ע�⽫�Ḳ�������ļ��е�<typeAliases>���塣
 */
//@Alias("user")

/**
 * ǰ�᣺һ���û���Ӧ�Ը���ɫ
 */
public class User {
    private Integer id;

    private String name;

    private String password;

    public User() {
    }

    public User(String name, Integer id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}