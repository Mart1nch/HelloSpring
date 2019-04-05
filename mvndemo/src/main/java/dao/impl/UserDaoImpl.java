package dao.impl;

import dao.UserDao;
import pojo.User;
import utils.DBHelper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDaoImpl implements UserDao {
    private User user;
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;


    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public User searchUser() {
        return null;
    }

    @Override
    public int updateUser() {
        return 0;
    }

    @Override
    public int deleteUser() {
        return 0;
    }

    @Override
    public int createUser() {
        return 0;
    }

    public User selectByUsername(String userName){
        String sql = "select * from wt_user where username = " + "'" + userName + "'";
        System.out.println(sql);
        conn = DBHelper.getConnection();
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            if (rs.next()){
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setUser_id(rs.getInt("user_id"));
                user.setUser_age(rs.getInt("user_age"));
            }else {
                user = null;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return user;
    }

}
