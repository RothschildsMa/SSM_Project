package com.ssm.framework.team1.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssm.framework.team1.entity.Employee;
import com.ssm.framework.team1.form.SearchForm;

@Mapper
public interface ListMapper {
	
	List<Employee> findall();
	
	List<Employee> findEmployees(SearchForm searchForm);
}
