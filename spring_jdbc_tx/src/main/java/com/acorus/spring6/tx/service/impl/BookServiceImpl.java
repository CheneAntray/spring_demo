package com.acorus.spring6.tx.service.impl;

import com.acorus.spring6.tx.dao.BookDao;
import com.acorus.spring6.tx.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * ClassName: BookServiceImpl
 * Package: com.acorus.spring6.tx.service.impl
 * Description:
 *
 * @Author Saber_991
 * @Create 2023/6/20 16:10
 * @Version 1.0
 */
@Service
public class BookServiceImpl implements BookService {

    //注入dao层
    @Autowired
    private BookDao bookDao;

//    @Transactional(propagation = Propagation.REQUIRED)         //支持当前事物，如果不存在就新建一个
    @Transactional(propagation = Propagation.REQUIRES_NEW)      //开启一个新事物，如果之前存在事务则挂起
//    @Transactional     //使用声明式事物
    @Override
    public void buyBook(Integer bookId, Integer userId) {
         //查询图书价格
        Integer price = bookDao.getPriceByBookId(bookId);
        //更新图书库存
        bookDao.updateStock(bookId);
        //更新用户余额
        bookDao.updateBalance(userId,price);
    }
}
