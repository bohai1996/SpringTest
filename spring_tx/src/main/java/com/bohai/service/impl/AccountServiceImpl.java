package com.bohai.service.impl;

import com.bohai.dao.AccountDao;
import com.bohai.service.AccountService;

public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void transfer(String outMan, String inMan, double money) {
        accountDao.out(outMan,money);
//        int a=1/0;
        accountDao.in(inMan,money);
    }
}
