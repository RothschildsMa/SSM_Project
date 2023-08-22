package com.ssm.framework.team3.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.framework.team3.bean.Attendance;
import com.ssm.framework.team3.mapper.AttendanceMapper;
import com.ssm.framework.team3.service.AttendanceService;

@Service
public class AttendanceServiceImpl implements AttendanceService {

	@Autowired
	AttendanceMapper attendanceMapper;
	
	@Override
	public List<Attendance> getAll(String date,String id) {
		return attendanceMapper.getAll(date,id);
	}

	@Override
	public void updateReq(List<String> dates) {
		attendanceMapper.updateReq(dates);
	}

}
