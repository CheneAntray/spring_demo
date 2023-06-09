package com.acorus.spring6.iocxml.automatic.dao;

/**
 * ClassName: UserDaoImpl
 * Package: com.acorus.spring6.iocxml.automatic.dao
 * Description:
 *
 * @Author Saber_991
 * @Create 2023/6/9 14:56
 * @Version 1.0
 */
public class UserDaoImpl implements UserDao{
    @Override
    public void addUserDao() {
        System.out.println("UserDao...");
    }
}
