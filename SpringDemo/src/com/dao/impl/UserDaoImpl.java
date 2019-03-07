package com.dao.impl;

import com.bean.User;
import com.dao.UserDao;

public class UserDaoImpl implements UserDao {

	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public void add() {
		System.out.println("UserDaoImpl-add");
	}

	@Override
	public void update() {
		System.out.println("UserDaoImpl-update");
	}
	
	public User search() {
		user.setName("mt");
		user.setAge(22);
		System.out.println(user);
		return user;
	}

}
