package com.acorus.spring6.iocxml.automatic.service;

import com.acorus.spring6.iocxml.automatic.dao.UserDao;

/**
 * ClassName: UserServiceImpl
 * Package: com.acorus.spring6.iocxml.automatic.service
 * Description:
 *
 * @Author Saber_991
 * @Create 2023/6/9 14:57
 * @Version 1.0
 */
public class UserServiceImpl implements UserService{

    //定义dao类型属性并生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUserService() {
        System.out.println("UserService...");
        //调用Dao中的方法
        userDao.addUserDao();

    }
}
