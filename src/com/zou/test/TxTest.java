package com.zou.test;

import com.zou.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: 邹祥发
 * @date: 2021/4/4 18:49
 */
public class TxTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.accountMoney();
    }
}
