package com.acorus.spring6.jdbc;

import org.springframework.stereotype.Component;

/**
 * ClassName: Emp
 * Package: com.acorus.spring6.jdbc
 * Description:
 *
 * @Author Saber_991
 * @Create 2023/6/16 11:05
 * @Version 1.0
 */
@Component
public class Emp {

    private Integer id;     //id
    private String name;    //name
    private Integer age;    //年龄
    private String gender;  //性别

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
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
