package com.zou.test;

import com.zou.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author: 邹祥发
 * @date: 2021/4/4 20:02
 */
@SpringJUnitConfig(locations = "classpath:bean.xml")
public class JTest5 {

    @Autowired
    private UserService userService;

    @Test
    public void test(){
        userService.accountMoney();
    }
}
