package com.ssm.framework.team2.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ssm.framework.team2.entity.AdData;
import com.ssm.framework.team2.form.SearchForm;
import com.ssm.framework.team2.service.AdService;

@Controller
public class ADController<Attendance> {
	@Autowired
	private AdService adService;

    @GetMapping("/attendance_day")
    public String showAttendanceList(SearchForm searchForm, Model model) {
      
        List<AdData> attendanceList = adService.getadMapper();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("attendanceList", attendanceList);
        return "Attendance_day";
    }

}



