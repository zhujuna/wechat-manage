package com.lz.wechat.base.dao.impl;

import com.lz.wechat.base.model.dataobject.AccountDO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao {

    @Select("select * from account")
    public List<AccountDO> findAll();

    @Insert("insert into account (name,money) value(#{name},#{money})")
    public void saveAccount(AccountDO accountDO);
}
