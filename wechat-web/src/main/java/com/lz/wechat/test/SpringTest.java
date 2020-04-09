package com.lz.wechat.test;

import com.lz.wechat.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    @Test
    public void run1(){

        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:application-context-base.xml");
        AccountService as = (AccountService) ac.getBean("accountService");
        as.findAll();
    }
}
