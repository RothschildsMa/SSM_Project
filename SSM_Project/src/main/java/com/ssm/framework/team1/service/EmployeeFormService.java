package com.ssm.framework.team1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.framework.team1.dao.EmployeeFormMapper;
import com.ssm.framework.team1.entity.EmployeeForm;

@Service
public class EmployeeFormService {
	
	@Autowired
    private EmployeeFormMapper employeeFormMapper;

    public void saveEmployee(EmployeeForm employeeForm) {
    	employeeFormMapper.insertEmployeeForm(employeeForm);
    }

}
