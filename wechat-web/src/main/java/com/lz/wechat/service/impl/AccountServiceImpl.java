package com.lz.wechat.service.impl;

import com.lz.wechat.model.dto.AccountDTO;
import com.lz.wechat.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {


    @Override
    public List<AccountDTO> findAll() {
        System.out.println("service层，查询所有账户。。。");
        return null;
    }

    @Override
    public void saveAccount(AccountDTO accountDTO) {
        System.out.println("service层，保持账户信息。。。");
    }
}
