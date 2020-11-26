package com.chen.pojo;

import java.util.Date;

/**
 * author: JINCHENCHEN
 * date: 2020/11/26
 */
public class User {
    private Long id;
    private String userName;
    private String password;
    private String name;
    private Integer age;
    private Boolean sex;
    private Date birthday;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", birthday=" + birthday +
                '}';
    }

    public User(Long id, String userName, String password, String name, Integer age, Boolean sex, Date birthday) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.birthday = birthday;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
