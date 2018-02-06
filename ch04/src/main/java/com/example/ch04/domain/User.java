package com.example.ch04.domain;

/**
 * 类名：User
 * 描述：TODO
 * 时间：2018/2/6 19:03
 *
 * @author <a href="2455676683@qq.com">zzq</a>
 */
public class User {

    private Long id;
    private String name;
    private int age;

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
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
