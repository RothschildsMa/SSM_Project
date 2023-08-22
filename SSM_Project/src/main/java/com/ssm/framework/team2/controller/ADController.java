package com.ssm.framework.team2.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ssm.framework.team2.dao.StatusMapper;
import com.ssm.framework.team2.entity.Attendance;
import com.ssm.framework.team2.entity.Status;
import com.ssm.framework.team2.form.SearchForm;
import com.ssm.framework.team2.service.AdService;

@Controller
public class ADController {
	@Autowired
	private AdService adService;
	
	
	@Autowired
	private StatusMapper statusMapper;
	

    @GetMapping("/attendance_day")
    public String showAttendanceList(SearchForm searchForm, Model model) {
      
        List<Attendance> attendanceList = adService.getAttendanceById("E0001");
       
        List<Status> statusList = statusMapper.FindStatusName();
        
        model.addAttribute("statusList", statusList);
        model.addAttribute("attendanceList", attendanceList);
        
        return "Attendance_day";
    }

}



