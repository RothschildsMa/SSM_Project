package com.ssm.framework.team3.service;

import java.util.List;

import com.ssm.framework.team3.bean.Attendance;


public interface AttendanceService {

	List<Attendance> getAll(String date,String id);
	
	void updateReq(List<String> dates);
}
