package com.chen.pojo;

import java.util.Objects;

/**
 * User: JINCHENCHEN
 * Date: 2020/10/29
 */
public class Dog {
    private Long id;
    private String name;
    private People owner;

    static {
        System.out.println("dog static");
    }

    public Dog() {
        System.out.println("dog no arguments constructor");
    }

    public Dog(Long id, String name, People owner) {
        System.out.println("dog arguments constructor");
        this.id = id;
        this.name = name;
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(id, dog.id) &&
                Objects.equals(name, dog.name) &&
                Objects.equals(owner, dog.owner);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, owner);
//    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", owner=" + owner +
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
        System.out.println("dog setter");
        this.name = name;
    }

    public People getOwner() {
        return owner;
    }

    public void setOwner(People owner) {
        this.owner = owner;
    }
}
