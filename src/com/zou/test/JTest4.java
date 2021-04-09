package com.zou.test;

import com.zou.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author: 邹祥发
 * @date: 2021/4/4 19:52
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:bean.xml")
public class JTest4 {

    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        userService.accountMoney();
    }
}
