package com.ssm.framework.team2.dao;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ssm.framework.team2.entity.Attendance;
import com.ssm.framework.team2.form.SearchForm;



@Mapper
public interface AdMapper {
	
	List<Attendance> findById(String employeeId);
	
	
	
	
	
	
    List<Attendance> searchAttendance(@Param("searchForm") SearchForm searchForm);
    
}
