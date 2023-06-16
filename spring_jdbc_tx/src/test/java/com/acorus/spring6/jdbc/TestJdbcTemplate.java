package com.acorus.spring6.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

/**
 * ClassName: TestJdbcTemplate
 * Package: com.acorus.spring6.jdbc
 * Description:
 *
 * @Author Saber_991
 * @Create 2023/6/16 11:09
 * @Version 1.0
 */
@SpringJUnitConfig(locations = "classpath:bean.xml")
public class TestJdbcTemplate {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private Emp emp;
    /**
     * jdbcTemlate测试增删改操作
     */
    @Test
    public void testUpdate(){
        //添加功能
        String sqlInsert = "insert into t_emp values (0,?,?,?)";
//        jdbcTemplate.update(sqlInsert,"小红",18,"女");
        //修改功能
        String sqlUpdate = "update  t_emp set name = ?,age = ?,gender = ? where id = ?";
//        jdbcTemplate.update(sqlUpdate,"张三",18,"男",1);
        //删除功能
        String sqlDel = "delete from t_emp where id = ?";
        jdbcTemplate.update(sqlDel,2);
    }

    /**
     * 测试查询返回一个对象
     */
    @Test
    public void queryForObject(){
        //第一种写法 实现RowMapper接口手动封装对象
        String sql = "select * from t_emp where id = ?";
        Emp empResult = jdbcTemplate.queryForObject(sql, (rs, i) -> {
            emp.setId(rs.getInt("id"));
            emp.setName(rs.getString("name"));
            emp.setGender(rs.getString("gender"));
            emp.setAge(rs.getInt("age"));
            return emp;
        }, 1);
        System.out.println(empResult);

        //第二种写法 使用Row的实现类 封装对象数据
        Emp empResult1 = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Emp.class), 3);
        System.out.println(empResult1);
    }

    /**
     * 测试查询返回list集合
     */
    @Test
    public void queryList(){
        //编写sql语句
        String sql = "select * from t_emp";
        //调用jdbcTemplate中方法查询lsit集合
        List<Emp> empList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Emp.class));
        System.out.println(empList);
    }

    /**
     * 测试查询返回单个值
     */
    @Test
    public void queryValue(){
        //编写sql语句
        String sql = "select count(*) from t_emp";
        //执行查询
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(count);
    }


}
