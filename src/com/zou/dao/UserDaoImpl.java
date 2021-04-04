package com.zou.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author: 邹祥发
 * @date: 2021/4/4 15:51
 */
@Repository
public class UserDaoImpl implements UserDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void reduceMoney() {
        String sql = "update t_account set money = money-? where username = ?";
        int i = jdbcTemplate.update(sql, 100, "zou");
        System.out.println(i);
    }

    @Override
    public void addMoney() {
        String sql = "update t_account set money = money+? where username = ?";
        int i = jdbcTemplate.update(sql, 100, "qq");
        System.out.println(i);
    }
}
