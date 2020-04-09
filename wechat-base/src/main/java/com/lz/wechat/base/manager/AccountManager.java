package com.lz.wechat.base.manager;

import com.lz.wechat.base.model.dataobject.AccountDO;

import java.util.List;

public interface AccountManager {

    public List<AccountDO> findAll();

    public void saveAccount(AccountDO accountDO);
}
