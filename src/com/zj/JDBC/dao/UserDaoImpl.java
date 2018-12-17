package com.zj.JDBC.dao;

import com.zj.JDBC.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao{

    /**
     * 保存用户信息
     * @param conn
     * @param user
     * @throws SQLException
     */
    @Override
    public void save(Connection conn, User user) throws SQLException {
        PreparedStatement ps = conn
                .prepareCall("insert into tbl_user(name,password,email) values (?,?,?)");
        ps.setString(1, user.getName());
        ps.setString(2, user.getPassword());
        ps.setString(3, user.getEmail());
        ps.execute();
    }

    /**
     * 根据用户的ID更新用户信息
     * @param conn
     * @param id
     * @param user
     * @throws SQLException
     */
    @Override
    public void update(Connection conn, Long id, User user) throws SQLException {
        PreparedStatement ps = conn
                .prepareCall("update tbl_user set name = ?,password = ?,email = ? where id = ?");
        ps.setString(1, user.getName());
        ps.setString(2, user.getPassword());
        ps.setString(3, user.getEmail());
        ps.setLong(4, id);
        ps.execute();

    }

    /**
     * 删除指定的用户信息
     * @param conn
     * @param user
     * @throws SQLException
     */
    @Override
    public void delete(Connection conn, User user) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("delete from tbl_user where id = ?");
        ps.setLong(1,user.getId());
        ps.execute();

    }
}
