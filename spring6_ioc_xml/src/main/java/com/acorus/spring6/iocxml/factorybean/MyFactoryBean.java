package com.acorus.spring6.iocxml.factorybean;

import com.acorus.spring6.iocxml.lifecycle.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * ClassName: MyFactoryBean
 * Package: com.acorus.spring6.iocxml.factorybean
 * Description:
 *
 * @Author Saber_991
 * @Create 2023/6/9 14:40
 * @Version 1.0
 */
public class MyFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
