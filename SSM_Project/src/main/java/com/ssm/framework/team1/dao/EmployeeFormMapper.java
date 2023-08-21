package com.ssm.framework.team1.dao;

import org.apache.ibatis.annotations.Mapper;

import com.ssm.framework.team1.entity.EmployeeForm;

@Mapper
public interface EmployeeFormMapper {
    void insertEmployeeForm(EmployeeForm employeeForm);
}
