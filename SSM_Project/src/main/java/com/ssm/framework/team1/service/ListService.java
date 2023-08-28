package com.ssm.framework.team1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.framework.team1.dao.ListMapper;
import com.ssm.framework.team1.entity.Employee;
import com.ssm.framework.team1.form.SearchForm;

@Service
public class ListService {
	
	@Autowired
	private ListMapper mapper;
	
	public List<Employee> getAllEmployee(){
		return mapper.findall();
	}
	
	
	public List<Employee> searchEmployee(String deptId,String employeeId){
		if("0".equals(deptId)) {
			return getAllEmployee();
		}
		else {
			return mapper.findEmployees(deptId,employeeId);
		}
	}
	
	public List<Employee> deleteEmployeeById(String employeeId) {
	      return mapper.deletebyId(employeeId);
	   }
}
