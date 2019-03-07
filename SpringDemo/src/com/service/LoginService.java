package com.service;

import com.bean.User;
import com.dao.UserDao;
import com.dao.impl.UserDaoImpl;

public class LoginService {

	private User user;
	private UserDaoImpl userDaoImpl;
//	private boolean loginning = false;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserDaoImpl getUserDaoImpl() {
		return userDaoImpl;
	}

	public void setUserDaoImpl(UserDaoImpl userDaoImpl) {
		this.userDaoImpl = userDaoImpl;
	}

	public void login(User u) {
		user = userDaoImpl.search();
		System.out.println(user);
		System.out.println(u);
		System.out.println(u==user);
		if(u.getName().equals(user.getName()) && u.getAge()==user.getAge()) {
			System.out.println("login sucessfully");
//			loginning = true;
		}else {
			System.out.println("login failed");
		}
	}
	
//	public void inspection() {
//		if(loginning == true) {
//			System.out.println("验证通过，已登陆");
//			
//		}else {
//			System.out.println("验证失败，未登陆");
//		}
//	}
}
