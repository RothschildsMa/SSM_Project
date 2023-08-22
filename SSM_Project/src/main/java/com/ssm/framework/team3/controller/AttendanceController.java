package com.ssm.framework.team3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.framework.team3.bean.Attendance;
import com.ssm.framework.team3.service.AttendanceService;

@Controller
@RequestMapping("/attendance")
public class AttendanceController {

	@Autowired
	AttendanceService attendanceService;
	
	@RequestMapping("/info")
    public String findAll(Model model){
		String date="2023/08";
		String id="E0001";
		List<Attendance> aList = attendanceService.getAll(date,id);
		System.out.println("列表"+aList);
		model.addAttribute("Attendances",aList);
        return "AttendanceInfo";
    }
	
	@PostMapping("/update")
	@ResponseBody
    public String update(@RequestParam(value = "dates[]")List<String> dates){
		try{
			attendanceService.updateReq(dates);
			 return "SUCCESS";
        }catch (Exception e){
            e.printStackTrace();
            return "FAIL";
        }
		
       
    }
}
