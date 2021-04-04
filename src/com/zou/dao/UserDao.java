package com.zou.dao;

/**
 * @author: 邹祥发
 * @date: 2021/4/4 15:51
 */
public interface UserDao {
    /**
     * 转钱方
     */
    void reduceMoney();

    /**
     * 收钱方
     */
    void addMoney();
}
