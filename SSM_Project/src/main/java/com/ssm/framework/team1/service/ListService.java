package com.ssm.framework.team1.service;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.framework.team1.dao.ListMapper;
import com.ssm.framework.team1.entity.Employee;


@Service
public class ListService {
	
	@Autowired
	private ListMapper mapper;
	
	public List<Employee> getAllEmployee(){
		return mapper.findall();
	}
	
	
	public List<Employee> searchEmployee(String deptId,String employeeId,Date fromDate,Date toDate){
		if("0".equals(deptId)) {
			return getAllEmployee();
		}
	
		else {
			return mapper.findEmployees(deptId,employeeId,fromDate,toDate);
		}
		
	}
	
	public List<Employee> deleteEmployeeById(String employeeId) {
	      return mapper.deletebyId(employeeId);
	   }
}
