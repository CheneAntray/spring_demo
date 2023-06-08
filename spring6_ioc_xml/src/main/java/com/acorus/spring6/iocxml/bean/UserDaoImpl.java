package com.acorus.spring6.iocxml.bean;


/**
 * ClassName: UserDaoImpl
 * Package: com.acorus.spring6.iocxml.bean
 * Description:
 *
 * @Author Saber_991
 * @Create 2023/6/8 10:23
 * @Version 1.0
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void run() {
        System.out.println("UserDaoImpl");
    }
}
