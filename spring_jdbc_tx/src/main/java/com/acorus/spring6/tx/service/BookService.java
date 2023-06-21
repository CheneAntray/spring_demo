package com.acorus.spring6.tx.service;

/**
 * ClassName: BookService
 * Package: com.acorus.spring6.tx.service
 * Description:
 *
 * @Author Saber_991
 * @Create 2023/6/20 13:57
 * @Version 1.0
 */
public interface BookService {
    /**
     * 业务层购买图书
     * @param book_id
     * @param user_id
     */
    public void buyBook(Integer book_id,Integer user_id);
}
