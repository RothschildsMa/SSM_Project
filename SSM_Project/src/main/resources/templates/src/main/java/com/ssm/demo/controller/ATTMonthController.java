package com.ssm.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/attendance-registration-month")
public class ATTMonthController {

    @GetMapping
    public String showAttendanceList(Model model) {
        // 这里可以添加查询勤怠信息的逻辑，并将数据传递给前端
        // 例如：List<AttendanceEntity> attendanceList = attendanceService.getAllAttendances();
        // model.addAttribute("attendanceList", attendanceList);

        return "ATTMonth"; // 返回前端页面的文件名
    }
}
