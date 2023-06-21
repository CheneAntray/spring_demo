package com.acorus.spring6.tx.dao;

/**
 * ClassName: BookDao
 * Package: com.acorus.spring6.jdbc.tx.dao
 * Description:
 *
 * @Author Saber_991
 * @Create 2023/6/20 13:53
 * @Version 1.0
 */
public interface BookDao {

    /**
     * 根据图书id查询图书价格
     * @param bookId
     */
    public Integer getPriceByBookId(Integer bookId);

    /**
     * 修改指定图书id的库存
     * @param bookId
     */
    public void updateStock(Integer bookId);

    /**
     * 修改用户的余额
     * @param userId
     * @param price
     */
    public void updateBalance(Integer userId,Integer price);

}
