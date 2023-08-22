package com.ssm.framework.team3.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.framework.team3.bean.Attendance;
import com.ssm.framework.team3.mapper.AttendanceMapper;
import com.ssm.framework.team3.service.AttendanceService;
import com.ssm.framework.team3.utils.ConvertUtils;

import ch.qos.logback.core.pattern.ConverterUtil;

@Service
public class AttendanceServiceImpl implements AttendanceService {

	@Autowired
	AttendanceMapper attendanceMapper;
	
	@Override
	public List<Attendance> getAll(String date,String id) {
		List<Attendance> aList=attendanceMapper.getAll(date,id);
		//曜日の形式を日本語に変換する
		aList.stream().forEach(item->item.setWeekDay(ConvertUtils.convertDate(item.getWeekDay())));
		return aList;
	}

	@Override
	public void updateReq(List<String> dates) {
		attendanceMapper.updateReq(dates);
	}

}
