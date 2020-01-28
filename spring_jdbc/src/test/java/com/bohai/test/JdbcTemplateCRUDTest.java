package com.bohai.test;

import com.bohai.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JdbcTemplateCRUDTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test
    public void testQueryCount(){
        String sql = "select count(*) from account";
        Long count = jdbcTemplate.queryForObject(sql,Long.class);
        System.out.println(count);
    }
    @Test
    public void testQueryOne(){
        String sql = "select * from account where name=?";
        Account tom = jdbcTemplate.queryForObject(
                sql,
                new BeanPropertyRowMapper<Account>(Account.class),
                "tom");
        System.out.println(tom);
    }

    @Test
    public void testQueryAll(){
        String sql = "select * from account";
        List<Account> list = jdbcTemplate.query(sql,
                new BeanPropertyRowMapper<Account>(Account.class));

        System.out.println(list);
    }

    @Test
    public void testUpdate(){
        String sql = "update account set money=? where name=?";
        jdbcTemplate.update(sql,10000,"tom2");
    }
    @Test
    public void testDelete(){
        String sql = "delete from account where name=?";
        jdbcTemplate.update(sql,"tom2");

    }



}
