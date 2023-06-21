package com.acorus.spring6.jdbc;

import com.acorus.spring6.config.SpringTxConfig;
import com.acorus.spring6.tx.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * ClassName: TestTx
 * Package: com.acorus.spring6.jdbc
 * Description:
 *
 * @Author Saber_991
 * @Create 2023/6/20 16:07
 * @Version 1.0
 */
@SpringJUnitConfig(classes = {SpringTxConfig.class})
public class TestTx {

    @Autowired
    private BookController bookController;

    /**
     * 测试无事物的情况
     */
    @Test
    public void buyBookWithoutTX(){
        //serviceimpl类去掉Transactional注解 测试buyBook方法
        bookController.buyBook(1,1);
    }

    /**
     * 测试使用事物的情况，实现扣费报错回滚减少库存的操作
     */
    @Test
    public void buyBookWithTX(){
        //serviceimpl添加@Transactional注解
        bookController.buyBook(1,1);
    }

    /**
     * 测试事物的传播行为
     */
    @Test
    public void testCheckout(){
        //测试使用当前事务和新建一个事务的不同事务传播行为
        bookController.checkout(new Integer[]{1, 2},1);;
    }

}
