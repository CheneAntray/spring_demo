package com.acorus.spring6.tx.controller;

import com.acorus.spring6.tx.service.BookService;
import com.acorus.spring6.tx.service.CheckoutSerivice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * ClassName: BookController
 * Package: com.acorus.spring6.tx.controller
 * Description:
 *
 * @Author Saber_991
 * @Create 2023/6/20 13:57
 * @Version 1.0
 */
@Controller
public class BookController {

    //注入bookservice层
    @Autowired
    private BookService bookService;

    //注入checkoutservice层
    @Autowired
    private CheckoutSerivice checkoutSerivice;

    /**
     * 购买单本书
     * @param bookId
     * @param userId
     */
    public void buyBook(Integer bookId,Integer userId){
        bookService.buyBook(bookId,userId);
    }

    /**
     * 批量购买书
     * @param bookIds
     * @param userId
     */
    public void checkout(Integer[] bookIds,Integer userId){
        checkoutSerivice.chekout(bookIds,userId);
    }

}
