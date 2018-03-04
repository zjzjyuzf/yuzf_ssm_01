package com.yuzf.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yuzf.ssm.pojo.User;
import com.yuzf.ssm.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	

	@RequestMapping("getAllUsers.do")
	public String getAllUsers() {
		
		List<User> users = userService.getAllUsers();
		
		for(User u : users) {
			System.out.println(u.getUsername());
		}
		
		return "success";
	}
	
}
