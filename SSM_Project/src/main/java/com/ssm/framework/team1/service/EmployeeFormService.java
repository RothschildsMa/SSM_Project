package com.ssm.framework.team1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.framework.team1.dao.DeptMapper;
import com.ssm.framework.team1.dao.EmployeeFormMapper;
import com.ssm.framework.team1.entity.Dept;
import com.ssm.framework.team1.entity.EmployeeForm;

@Service
public class EmployeeFormService {
	
	@Autowired
    private EmployeeFormMapper employeeFormMapper;
	
	@Autowired
	private DeptMapper deptMapper;
	
	public List<Dept> findDepartments(){
		return deptMapper.FindDeptName();
	}
	
	// 登録用
	public String getNewEmployeeId() {
		String maxId = employeeFormMapper.getMaxEmployeeId();
		if (maxId == null || maxId.isEmpty()) {
            return "E0001"; 
        }
        int number = Integer.parseInt(maxId.substring(1));
        number++;
        String newId = "E" + String.format("%04d", number);
        return newId;
    }
	 
    public void createEmployee(EmployeeForm employeeForm) {
    	employeeFormMapper.insertEmployeeForm(employeeForm);
    }
    
	// 更新用
	 public EmployeeForm getEmployeeById(String EMPLOYEE_ID) {
		 return employeeFormMapper.getEmployeeById(EMPLOYEE_ID);
	    }
	
	 public void updateEmployee(EmployeeForm employeeForm) {
		 employeeFormMapper.updateEmployeeForm(employeeForm);
	    }
    
}