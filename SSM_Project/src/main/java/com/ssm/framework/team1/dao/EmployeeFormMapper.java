package com.ssm.framework.team1.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.ssm.framework.team1.entity.EmployeeForm;

@Mapper
public interface EmployeeFormMapper {
	
	// 登録用
    void insertEmployeeForm(EmployeeForm employeeForm);
    
    @Select("SELECT MAX(EMPLOYEE_ID) FROM T_EMPLOYEE")
    String getMaxEmployeeId();
    
    // 更新用
    void updateEmployeeForm(EmployeeForm employeeForm);
    
    EmployeeForm getEmployeeById(String EMPLOYEE_ID);
}
