package com.springboottraining.department.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboottraining.department.entity.Department;
import com.springboottraining.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	
	Logger logger = LoggerFactory.getLogger(DepartmentService.class);
	
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		logger.info("Calling saveDepartment method of DepartmentService");
		return departmentRepository.save(department);
	}

	public Department getDepartmentById(Long departmentId) {
		logger.info("Calling getDepartmentById method of DepartmetService ");
		return departmentRepository.findByDepartmentId(departmentId);
	}
}
