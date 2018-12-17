package com.zj.JDBC;

import java.sql.*;

public class JDBCTest {
    public static Connection getConnection() {
        Connection conn = null;
        //注册JDBC的驱动程序
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //获取myql的数据S库连接
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_db?serverTimezone=GMT%2B8","root","012138");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;

    }

    public static void insert() {
        Connection conn = getConnection();
        String sql = "insert into tbl_user(name,password,email)" +
                "values('Tom','123456','tom@outlook.com')";
        Statement st = null;
        try {
            st = conn.createStatement();
        int count = st.executeUpdate(sql);
        System.out.println("向用户表中插入了" + count + "条记录");
        conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        insert();

    }
}
