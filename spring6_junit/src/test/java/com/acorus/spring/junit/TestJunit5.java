package com.acorus.spring.junit;

import com.acorus.spring.bean.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * ClassName: TestJunit5
 * Package: com.acorus.spring.junit
 * Description:
 *
 * @Author Saber_991
 * @Create 2023/6/16 9:23
 * @Version 1.0
 */
//方式一
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:bean.xml")
//方式二
@SpringJUnitConfig(locations = "classpath:bean.xml")
public class TestJunit5 {

    @Autowired
    private User user;

    /**
     * 测试spring整合junti5
     */
    @Test
    public void testUser(){
        user.setName("aaa");
        System.out.println(user);
    }
}
