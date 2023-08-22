package com.ssm.framework.team1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.framework.team1.dao.EmployeeFormMapper;
import com.ssm.framework.team1.entity.EmployeeForm;

@Service
public class EmployeeFormService {
	
	@Autowired
    private EmployeeFormMapper employeeFormMapper;
	
	// 登録用
	public String getMaxEmployeeId() {
        return employeeFormMapper.getMaxEmployeeId();
    }
	 
    public void createEmployee(EmployeeForm employeeForm) {
    	employeeFormMapper.insertEmployeeForm(employeeForm);
    }
    
	// 更新用
	 public EmployeeForm getEmployeeById(String EMPLOYEE_ID) {
	        return employeeFormMapper.getEmployeeById(EMPLOYEE_ID);
	    }
	
	 public void updateEmployee(EmployeeForm employeeForm) {
	        employeeFormMapper.updateEmployee(employeeForm);
	    }
    
}
