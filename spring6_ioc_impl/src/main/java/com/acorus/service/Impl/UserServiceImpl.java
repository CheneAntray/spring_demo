package com.acorus.service.Impl;

import com.acorus.annotation.CreateBean;
import com.acorus.annotation.Di;
import com.acorus.dao.UserDao;
import com.acorus.service.UserService;

/**
 * ClassName: UserServiceImpl
 * Package: com.acorus.service.Impl
 * Description:
 *
 * @Author Acorus
 * @Create 2023/6/13 13:11
 * @Version 1.0
 */
@CreateBean
public class UserServiceImpl implements UserService {

    @Di
    private UserDao userDao;

    @Override
    public void addUser() {
        userDao.addUser();
//        System.out.println("UserServiceImpl");
    }
}
