package com.lz.wechat.service;

import com.lz.wechat.base.model.dataobject.AccountDO;
import com.lz.wechat.model.dto.AccountDTO;

import java.util.List;

public interface AccountService {

    public List<AccountDO> findAll();

    public void saveAccount(AccountDO accountDO);
}
