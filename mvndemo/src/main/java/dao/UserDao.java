package dao;

import pojo.User;


public interface UserDao {
    public User searchUser();

    public int updateUser();

    public int deleteUser();

    public int createUser();

}
