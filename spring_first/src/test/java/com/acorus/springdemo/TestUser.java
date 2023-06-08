package com.acorus.springdemo;

import com.acorus.spingdemo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: TestUser
 * Package: com.acorus.springdemo
 * Description:
 *
 * @Author Saber_991
 * @Create 2023/6/7 16:27
 * @Version 1.0
 */
public class TestUser {

    @Test
    public void testUserObject(){
        //加载spring配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //对象创建
        User user = (User)context.getBean("user");
        //对象使用
        user.add();
        /*
        * 1，加载bean.xml配置文件
        * 2，对xml进行解析操作
        * 3，获取xml文件bean标签属性值
        * 4，使用反射根据类全路径创建对象
        * 5，把对象放在了beanDefinitionMap 集合中
        * */

    }
}
