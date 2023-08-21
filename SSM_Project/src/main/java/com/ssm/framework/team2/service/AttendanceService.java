package com.ssm.framework.team2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssm.framework.team2.entity.AttendanceRepository;
import com.ssm.framework.team3.bean.Attendance;

@Service
public class AttendanceService {
	private AttendanceRepository attendanceRepository;
	 public List<Attendance> getAllAttendances() {
	        return attendanceRepository.findAll();
	    }

}
