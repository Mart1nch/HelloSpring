package com.dao.impl;

import com.dao.StudentDao;

public class StudentDaoImpl implements StudentDao {

	@Override
	public void delete() {
		System.out.println("StudentDaoImpl-delete");
	}

	@Override
	public void select() {
		System.out.println("StudentDaoImpl-select");
	}

}
