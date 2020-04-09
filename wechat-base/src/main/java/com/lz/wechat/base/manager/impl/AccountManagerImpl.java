package com.lz.wechat.base.manager.impl;

import com.lz.wechat.base.manager.AccountManager;
import com.lz.wechat.base.model.dataobject.AccountDO;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class AccountManagerImpl implements AccountManager {


    @Override
    public List<AccountDO> findAll() {
        System.out.println("Service层，查询所有用户。。。");
        return null;
    }

    @Override
    public void saveAccount(AccountDO accountDO) {
        System.out.println("Service层，保存账户。。。");
    }
}
