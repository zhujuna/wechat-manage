package com.lz.wechat.controller;

import com.lz.wechat.base.model.dataobject.AccountDO;
import com.lz.wechat.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AccountController {

    @Autowired
    private AccountService accountServiceImpl;

    @RequestMapping("/account/findAll")
    public String findAll(Model model){

        List<AccountDO> list = accountServiceImpl.findAll();
        model.addAttribute("list",list);
        return "list";  //在视图解析器中配置了前缀后缀
    }
}
