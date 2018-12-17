package com.zj.JDBC.test;

import com.zj.JDBC.util.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactoryTest {
    public static void main(String[] args) {
        ConnectionFactory cf = ConnectionFactory.getInstance();
        Connection conn = cf.makeConnection();
        try {
            System.out.println(conn.getAutoCommit());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
