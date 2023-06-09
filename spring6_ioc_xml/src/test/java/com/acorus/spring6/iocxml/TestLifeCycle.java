package com.acorus.spring6.iocxml;

import com.acorus.spring6.iocxml.lifecycle.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: TestLifeCycle
 * Package: com.acorus.spring6.iocxml
 * Description: 测试bean生命周期
 *
 * @Author Saber_991
 * @Create 2023/6/9 13:54
 * @Version 1.0
 */
public class TestLifeCycle {

    /**
     * 测试bean生命周期
     */
    @Test
    public void testLifeCycle(){
        //加载配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean_lifecycle.xml");
        //获取对象
        User user = (User) context.getBean("user");
        System.out.println("6,bean对象创建完成");
//        System.out.println(user);
        //销毁
        context.close();

    }
}
