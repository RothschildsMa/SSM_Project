package com.ssm.framework.team1.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.ssm.framework.team1.entity.EmployeeForm;

@Mapper
public interface EmployeeFormMapper {
	
	// 登録用
    void insertEmployeeForm(EmployeeForm employeeForm);
    
    @Select("SELECT MAX(EMPLOYEE_ID) FROM T_EMPLOYEE")
    String getMaxEmployeeId();
    
    // 更新用
    @Update("UPDATE T_EMPLOYEE SET EMPLOYEE_NAME = #{EMPLOYEE_NAME}, GENDER_ID = #{GENDER_ID}, AGE = #{AGE}, DEPT_ID = #{DEPT_ID}, TELEPHONE_NUMBER = #{TELEPHONE_NUMBER}, MAIL_ADDRESS = #{MAIL_ADDRESS} WHERE EMPLOYEE_ID = #{EMPLOYEE_ID}")
    void updateEmployeeForm(EmployeeForm employeeForm);
    
    EmployeeForm getEmployeeById(String EMPLOYEE_ID);
}
