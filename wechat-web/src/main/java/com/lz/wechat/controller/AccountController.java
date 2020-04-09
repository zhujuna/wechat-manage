package com.lz.wechat.controller;

import com.lz.wechat.model.dto.AccountDTO;
import com.lz.wechat.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AccountController {

    @Autowired
    private AccountService accountServiceImpl;


    @RequestMapping("/account/findAll")
    public String findAll(){
        List<AccountDTO> list =  accountServiceImpl.findAll();

        return "list";  //在视图解析器中配置了前缀后缀
    }
}
