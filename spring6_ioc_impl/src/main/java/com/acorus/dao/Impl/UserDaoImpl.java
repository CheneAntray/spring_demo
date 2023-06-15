package com.acorus.dao.Impl;

import com.acorus.annotation.CreateBean;
import com.acorus.dao.UserDao;

/**
 * ClassName: UserDaoImpl
 * Package: com.acorus.dao.Impl
 * Description:
 *
 * @Author Acorus
 * @Create 2023/6/13 13:11
 * @Version 1.0
 */
@CreateBean
public class UserDaoImpl implements UserDao {
    @Override
    public void addUser() {
        System.out.println("UserDaoImpl.addUser");
    }
}
