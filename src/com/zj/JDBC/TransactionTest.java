package com.zj.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionTest {
    public static Connection getConnection() {
        Connection conn = null;
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_db?serverTimezone=GMT%2B8","root","012138");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void insertUserData(Connection conn) throws SQLException{
            String sql = "insert into tbl_user(id,name,password,email)" +
                    "values(1,'Tom','123456','tom@outlook.com')";
            Statement st = null;
            st = conn.createStatement();
            int count = st.executeUpdate(sql);
            System.out.println("向用户表中插入了" + count + "条记录");

    }

    public static void insertAddressData(Connection conn) throws SQLException {
            String sql = "insert into tbl_address(id,city,country,user_id)" +
                    "values(1,'shanghai','china','10')";
            Statement st = null;
            st = conn.createStatement();
            int count = st.executeUpdate(sql);
            System.out.println("向地址表中插入了" + count + "条记录");
            conn.close();
    }

    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = getConnection();
            conn.setAutoCommit(false);

            insertUserData(conn);
            insertAddressData(conn);

            conn.commit();
        } catch (SQLException e) {
            System.out.println("------获取到SQL异常-------");
            e.printStackTrace();
            try {
                conn.rollback();
                System.out.println("------事务回滚成功-------");
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e3) {
                e3.printStackTrace();
            }
        }

    }

}
