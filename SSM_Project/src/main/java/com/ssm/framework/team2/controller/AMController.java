package com.ssm.framework.team2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ssm.framework.team2.entity.AmData;
import com.ssm.framework.team2.service.AmService;

//Author Chin

@Controller
public class AMController {
	@Autowired
	private AmService amService;

	@GetMapping("/attendance_month")
	public String getAttendance(Model model) {

		List<AmData> attendanceList = amService.getAmInfo();

		model.addAttribute("attendanceList", attendanceList);
		return "attendance_month";
	}

//	private List<AmData> getAmInfo() {
//
//		List<AmData> attendanceList = new ArrayList<>();
//		attendanceList.add(new AmData());
//		attendanceList.add(new AmData());
//
//		return attendanceList;
}
