package com.bohai.dao.impl;

import com.bohai.dao.AccountDao;
import org.springframework.jdbc.core.JdbcTemplate;

public class AccountDaoImpl implements AccountDao {
    private JdbcTemplate jdbcTemplate;
    public void out(String outMan, double money) {
        String sql = "update account set money=money-? where name=?";
        jdbcTemplate.update(sql,money,outMan);
    }

    public void in(String inMan, double money) {
        String sql="update account set money=money+? where name=?";
        jdbcTemplate.update(sql,money,inMan);
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
