package com.zou.service;

import com.zou.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: 邹祥发
 * @date: 2021/4/4 15:52
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserService {
    @Autowired
    private UserDao userDao;

    /**
     * 转账的方法
     */
    public void accountMoney(){
        //少钱
        userDao.reduceMoney();

        //多钱
        userDao.addMoney();
    }
}
