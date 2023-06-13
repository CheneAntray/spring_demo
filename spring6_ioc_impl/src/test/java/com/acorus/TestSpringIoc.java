package com.acorus;

import com.acorus.core.ApplicationContext;
import com.acorus.core.CustomizationApplicationContext;
import com.acorus.service.Impl.UserServiceImpl;
import com.acorus.service.UserService;
import org.junit.Test;

/**
 * ClassName: TestSpringIoc
 * Package: com.acorus
 * Description:
 *
 * @Author Acorus
 * @Create 2023/6/13 17:18
 * @Version 1.0
 */
public class TestSpringIoc {

    /**
     * 测试自定义实现装配bean
     */
    @Test
    public void testCreatBean(){
        //根据包路径扫描并装载bean
        CustomizationApplicationContext context = new CustomizationApplicationContext("com.acorus");
        UserService userService = (UserService) context.getBean(UserService.class);
        userService.addUser();
    }
}
