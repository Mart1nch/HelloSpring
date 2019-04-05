package service;

import dao.impl.UserDaoImpl;
import pojo.User;

public class LoginService {

    private User user;
    private UserDaoImpl userDaoImpl;


    public void setUser(User user) {
        this.user = user;
    }

    public void setUserDaoImpl(UserDaoImpl userDaoImpl) {
        this.userDaoImpl = userDaoImpl;
    }

    public void login(User u){
        System.out.println("print1:" + u);
        user = userDaoImpl.selectByUsername(u.getUsername());
        System.out.println("print2:" + user);
        System.out.println("print3:" + u);

        if (user != null){
            System.out.println(user.getUsername());
            System.out.println(user.getPassword());
            if (user.getPassword().equals(u.getPassword())){
                System.out.println("登陆成功");
            }else {
                System.out.println("登陆失败");
            }
        }else {
            System.out.println("登陆失败");
        }

    }

}
