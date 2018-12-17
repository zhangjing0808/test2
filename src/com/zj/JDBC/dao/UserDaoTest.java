package com.zj.JDBC.dao;

import com.zj.JDBC.entity.User;
import com.zj.JDBC.util.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class UserDaoTest {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = ConnectionFactory.getInstance().makeConnection();
            conn.setAutoCommit(false);

            UserDao userDao = new UserDaoImpl();
            User tom = new User();
            tom.setName("Tom");
            tom.setPassword("123456");
            tom.setEmail("tom@gmail.com");

            userDao.save(conn,tom);

            conn.commit();
        } catch (Exception e) {
            try {
                conn.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }

    }
}
