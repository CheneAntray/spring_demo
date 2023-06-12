package com.acorus.reflect;

/**
 * ClassName: Car
 * Package: com.acorus.reflect
 * Description:
 *
 * @Author Saber_991
 * @Create 2023/6/12 14:52
 * @Version 1.0
 */
public class Car {

    private String name;    //name
    private Integer age;    //age
    private String color;   //color

    public Car() {
    }

    public Car(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    private void run(){
        System.out.println("私有方法：run.....");
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
