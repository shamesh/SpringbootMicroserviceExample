package com.springboottraining.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboottraining.user.entity.User;
import com.springboottraining.user.service.UserService;
import com.springboottraining.user.valueObject.ResponseTemplateValueObject;

@RestController
@RequestMapping("/users")
public class UserController {
	
	Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public User saveUser(@RequestBody(required = true) User user) {
		logger.info(" Saving user "+user.toString());
		return userService.saveUser(user);
	}
	
	@RequestMapping("/{id}")
	public ResponseTemplateValueObject getUserWithDepartment(@PathVariable("id") Long userId) {
		return userService.getUserWithDepartment(userId);
	}
	

}
