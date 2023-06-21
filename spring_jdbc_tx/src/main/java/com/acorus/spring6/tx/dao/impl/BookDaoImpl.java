package com.acorus.spring6.tx.dao.impl;

import com.acorus.spring6.tx.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * ClassName: BookDaoImpl
 * Package: com.acorus.spring6.tx.dao.impl
 * Description:
 *
 * @Author Saber_991
 * @Create 2023/6/20 14:05
 * @Version 1.0
 */
@Repository
public class BookDaoImpl implements BookDao {

    //注入jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Integer getPriceByBookId(Integer bookId) {
        String sql = "select price from t_book where book_id = ?";
        return jdbcTemplate.queryForObject(sql, Integer.class, bookId);

    }

    @Override
    public void updateStock(Integer bookId) {
        String sql = "update t_book set stock = stock-1 where book_id = ?";
        jdbcTemplate.update(sql,bookId);
    }

    @Override
    public void updateBalance(Integer userId, Integer price) {
        String sql = "update t_user set balance = balance - ? where user_id = ?";
        jdbcTemplate.update(sql,price,userId);
    }
}
