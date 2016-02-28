package com.hello.entity;

/**
 * Created by xuan on 2016/2/26.
 */

/**
 * user的扩展对象（使用resultType）
 */
public class UserInfo extends User{

    //添加的role属性
    private String roleName;

    public UserInfo() {
    }

    public UserInfo(String roleName) {
        this.roleName = roleName;
    }

    public UserInfo(String name, Integer id, String password, String roleName) {
        super(name, id, password);
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
