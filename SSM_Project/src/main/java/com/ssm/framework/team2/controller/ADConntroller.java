package com.ssm.framework.team2.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ssm.framework.team2.entity.AmData;
@Controller
public class ADConntroller {
	private AdServer adServer;
	@GetMapping("/attendance_day")
	public String getAttendance(Model model) {

		List<AmData> attendanceList = amService.getAmInfo();

		model.addAttribute("attendanceList", attendanceList);
		return "attendance_month";
	}
}
