package com.ssm.framework.team3.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.ssm.framework.team3.bean.Attendance;

@Repository
public interface AttendanceMapper {

	List<Attendance> getAll(@Param("date")String date,@Param("id")String id);
	
	void updateReq(List<String> dates);
}
