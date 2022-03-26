package com.springboottraining.user.valueObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
	
	private Long departmentId;
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;

	@Override
	public String toString() {
		return "\ndepartmentId:" +departmentId +"\ndepartmentName:"+ departmentName+"\ndepartmentAddress:"+departmentAddress+"\ndepartmentCode"+departmentCode;
		
	}
}
