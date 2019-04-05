package test;

import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.User;
import service.LoginService;
import utils.DBHelper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class t1Test {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    User user = null;
    LoginService loginService = null;



    @Test
    public void test1() {
        conn = DBHelper.getConnection();
        String sql = "select * from wt_user";
        try {
            stmt = conn.createStatement();
//            rs = stmt.executeQuery(sql);
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                user.setUser_id(rs.getInt("user_id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                System.out.println(user);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void test2(){
        User user = null;

        ApplicationContext contest = new ClassPathXmlApplicationContext("applicationContext.xml");
        loginService = (LoginService)contest.getBean("loginService");
        user = (User)contest.getBean("user");
        user.setUsername("martin");
        user.setPassword("root");
        loginService.login(user);
    }

}