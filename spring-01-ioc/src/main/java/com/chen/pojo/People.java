package com.chen.pojo;

import java.util.Date;
import java.util.Objects;

/**
 * User: JINCHENCHEN
 * Date: 2020/10/29
 */
public class People {
    private Long id;
    private String name;
    private Date birthday;

    static {
        System.out.println("people static");
    }

    public People() {
        System.out.println("people no arguments constructor");
    }

    public People(Long id, String name, Date birthday) {
        System.out.println("people arguments constructor");
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return Objects.equals(id, people.id) &&
                Objects.equals(name, people.name) &&
                Objects.equals(birthday, people.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, birthday);
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("people setter");
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
