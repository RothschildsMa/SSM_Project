package com.ssm.framework.team2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.ssm.framework.team2.entity.AmData;

import com.ssm.framework.team2.service.AmService;

//Author Chin

@Controller
public class AMController {
	@Autowired
	private AmService amService;

	@GetMapping("/attendance_month")
	public String getAttendance(Model model) {

		List<String> yearList = amService.getYear();
		model.addAttribute("yearList", yearList);

		List<AmData> attendanceMonths = amService.getAmInfo("2023");
		model.addAttribute("attendanceMonths", attendanceMonths);

		return "attendance_month";
	}


//	private List<AmData> getAmInfo() {
//
//		List<AmData> attendanceList = new ArrayList<>();
//		attendanceList.add(new AmData());
//		attendanceList.add(new AmData());
//
//		return attendanceList;
	


	@GetMapping("/month/{selectedYear}")
	public String handleSubmit(@PathVariable String selectedYear, Model model) {
		List<String> yearList = amService.getYear();
		model.addAttribute("yearList", yearList);

		List<AmData> attendanceMonths = amService.getAmInfo(selectedYear);

		model.addAttribute("outputYear", selectedYear);
		model.addAttribute("attendanceMonths", attendanceMonths);

		return "attendance_month";
	}



}
