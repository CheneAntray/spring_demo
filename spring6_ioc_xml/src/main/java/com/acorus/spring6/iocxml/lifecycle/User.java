package com.acorus.spring6.iocxml.lifecycle;

/**
 * ClassName: User
 * Package: com.acorus.spring6.iocxml.lifecycle
 * Description:
 *
 * @Author Saber_991
 * @Create 2023/6/9 13:44
 * @Version 1.0
 */
public class User {

    private String name;    //name

    public User() {
        System.out.println("1,bean对象创建，调用无参构造参数");
    }

    /**
     * 初始化
     */
    public void initMethod(){
        System.out.println("4,bean对象的初始化，调用指定的初始化方法");
    }

    /**
     * bean对象的销毁
     */
    public void destroyMethod(){
        System.out.println("7,bean对象的销毁，调用指定的销毁方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("2,给bean对象设置属性值");
        this.name = name;
    }
}
