package com.springboottraining.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springboottraining.user.entity.User;
import com.springboottraining.user.repository.UserRepository;
import com.springboottraining.user.valueObject.Department;
import com.springboottraining.user.valueObject.ResponseTemplateValueObject;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private Environment env;

	public User saveUser(User user) {

		return userRepository.save(user);
	}

	public ResponseTemplateValueObject getUserWithDepartment(Long userId) {
		ResponseTemplateValueObject vo = new ResponseTemplateValueObject();
		User user = userRepository.findByUserId(userId);
		vo.setUser(user);
		String url = env.getProperty("department.url");
		if (user != null && url != null) {
			Department department = restTemplate.getForObject(url + user.getUserId(), Department.class);
			vo.setDepartment(department);
		}
		return vo;
	}

}
