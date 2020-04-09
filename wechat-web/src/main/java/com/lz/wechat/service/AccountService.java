package com.lz.wechat.service;

import com.lz.wechat.model.dto.AccountDTO;

import java.util.List;

public interface AccountService {

    public List<AccountDTO> findAll();

    public void saveAccount(AccountDTO accountDTO);
}
