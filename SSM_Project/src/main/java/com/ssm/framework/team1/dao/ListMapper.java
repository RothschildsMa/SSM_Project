package com.ssm.framework.team1.dao;


import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssm.framework.team1.entity.Employee;


@Mapper
public interface ListMapper {
	
	List<Employee> findall();
	
	List<Employee> findEmployees(String deptId,String employeeId,String fromDate,String toDate);
	
	List<Employee> deletebyId(String employeeId);
}
