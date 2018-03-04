package com.yuzf.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.yuzf.ssm.dao.UserDaoMapper;
import com.yuzf.ssm.pojo.User;
import com.yuzf.ssm.service.UserService;

public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDaoMapper userDao;

	@Override
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}
	
}
