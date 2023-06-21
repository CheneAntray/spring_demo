package com.acorus.spring6.tx.service.impl;

import com.acorus.spring6.tx.service.BookService;
import com.acorus.spring6.tx.service.CheckoutSerivice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * ClassName: CheckoutService
 * Package: com.acorus.spring6.tx.service.impl
 * Description:
 *
 * @Author Saber_991
 * @Create 2023/6/21 16:43
 * @Version 1.0
 */
@Service
public class CheckoutServiceImpl implements CheckoutSerivice {

    //注入bookservice层
    @Autowired
    private BookService bookService;

    /**
     * 开启事物测试事务的传播行为
     * @param booIds
     * @param userId
     */
    @Transactional
    @Override
    public void chekout(Integer[] booIds, Integer userId) {
        for (Integer booId : booIds) {
            bookService.buyBook(booId,userId);
        }
    }
}
