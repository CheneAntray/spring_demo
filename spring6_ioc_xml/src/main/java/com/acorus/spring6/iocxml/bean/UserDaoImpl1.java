package com.acorus.spring6.iocxml.bean;


/**
 * ClassName: UserDaoImpl1
 * Package: com.acorus.spring6.iocxml.bean
 * Description:
 *
 * @Author Saber_991
 * @Create 2023/6/8 10:44
 * @Version 1.0
 */
public class UserDaoImpl1 implements UserDao {
    @Override
    public void run() {
        System.out.println("UserDaoImpl1");
    }
}
