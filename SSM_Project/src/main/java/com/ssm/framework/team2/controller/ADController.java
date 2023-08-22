package com.ssm.framework.team2.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.ssm.framework.team1.form.SearchForm;
import com.ssm.framework.team2.dao.StatusMapper;
import com.ssm.framework.team2.service.AdService;

@Controller
public class ADController {
	@Autowired
private AdService adService;

    @Autowired
    private StatusMapper statusMapper;

    @GetMapping("/search1")
    public String showEditPage(@ModelAttribute SearchForm searchForm, Model model) {
       
//    	List<AttendanceList>attendanceList = AdService.getAttendanceById("001");
//        List<Status> statusList = statusMapper.findStatusName();
//        model.addAttribute("statusList", statusList);
//        model.addAttribute("attendanceList", attendanceList);
        return "Attendance_day";
    }

}



