package com.shadow.dao;

import com.shadow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

@Component
public class UserDao {

	// @Autowired
	// private UserService userService;

	// public UserDao() {
	// 	System.out.println("构造方法");
	// }

	@PostConstruct
	public void init() {
		System.out.println("init方法");
	}

	public void test() {
		System.out.println("test");
		// userService.query();
	}
}
