package com.acorus.spring.junit;

import com.acorus.spring.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ClassName: TestJunit4
 * Package: com.acorus.spring.junit
 * Description:
 *
 * @Author Saber_991
 * @Create 2023/6/16 9:24
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:bean.xml")
public class TestJunit4 {

    @Autowired
    private User user;

    /**
     * 测试spring整合junit4
     */
    @Test
    public void testJunit4(){
        user.setName("999");
        System.out.println(user);
    }
}
