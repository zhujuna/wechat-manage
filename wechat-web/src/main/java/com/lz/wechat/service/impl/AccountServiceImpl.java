package com.lz.wechat.service.impl;

import com.lz.wechat.base.dao.impl.AccountDao;
import com.lz.wechat.base.model.dataobject.AccountDO;
import com.lz.wechat.model.dto.AccountDTO;
import com.lz.wechat.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<AccountDO> findAll() {
        System.out.println("service层，查询所有账户。。。");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(AccountDO accountDO) {
        System.out.println("service层，保持账户信息。。。");
    }
}
