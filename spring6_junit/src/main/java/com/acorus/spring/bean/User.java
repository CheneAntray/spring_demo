package com.acorus.spring.bean;

import org.springframework.stereotype.Component;

/**
 * ClassName: User
 * Package: com.acorus.spring.bean
 * Description:
 *
 * @Author Saber_991
 * @Create 2023/6/16 9:22
 * @Version 1.0
 */
@Component
public class User {

    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
