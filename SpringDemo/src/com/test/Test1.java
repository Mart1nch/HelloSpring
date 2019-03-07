package com.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.User;
import com.dao.impl.UserDaoImpl;
import com.service.LoginService;

public class Test1 {

		User user;
		UserDaoImpl userDaoImpl;
		LoginService loginService;
	
	@Test
	public void t1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		user = (User) context.getBean("user");
		userDaoImpl = (UserDaoImpl) context.getBean("userDaoImpl");
		loginService = (LoginService) context.getBean("loginService");
		
		user.setName("mt");
		user.setAge(12);
		loginService.login(user);
	}
	
}
