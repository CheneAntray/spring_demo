package com.acorus.spring6.resource.service;


import com.acorus.spring6.resource.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: UserServiceImpl
 * Package: com.acorus.spring6.iocxml.automatic.service
 * Description:
 *
 * @Author Saber_991
 * @Create 2023/6/9 14:57
 * @Version 1.0
 */
@Service("myUserService")
public class UserServiceImpl implements UserService {

    //定义dao类型属性并生成set方法
    @Autowired
    private UserDao userDao;


    @Override
    public void addUserService() {
        System.out.println("UserService...");
        //调用Dao中的方法
        userDao.addUserDao();

    }
}
