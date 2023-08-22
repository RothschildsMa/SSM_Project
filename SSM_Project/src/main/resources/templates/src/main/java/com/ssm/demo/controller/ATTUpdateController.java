package com.ssm.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ssm.demo.entity.Status;
import com.ssm.demo.form.RegisterForm;
import com.ssm.demo.mapper.StatusMapper;
import com.ssm.demo.service.ATTUpdateService;
import java.util.List;

@Controller
public class ATTUpdateController {

    @Autowired
    private ATTUpdateService attendanceService;    
    private List<Status> statusList;
    
    @Autowired
    private StatusMapper statusMapper;

    @GetMapping("/insert")
    public String showAddPage(Model model,RegisterForm registerForm) {
    	
    	statusList = statusMapper.FindStatusName();
        model.addAttribute("statusList", statusList);
        model.addAttribute("registerForm", new RegisterForm());
    	return "ATTUpdate"; 
    }

    @PostMapping("/submit")
    public String submitAttendance(RegisterForm registerForm) {
    	attendanceService.submitAttendance(registerForm);
        return "redirect:/edit";
    }
    @GetMapping("/add/{date}/update")
    public String showUpdatePage(@PathVariable String date, Model model,RegisterForm registerForm) {  	
    	statusList = statusMapper.FindStatusName();
        model.addAttribute("statusList", statusList);
        attendanceService.updateAttendance(registerForm, date);
    	return "ATTUpdate"; 
    }
    @PostMapping("/update2")
    public String updateTable(RegisterForm registerForm) {
    	attendanceService.update(registerForm);
        return "redirect:/edit";
    }
}


//这个文件定义了一个控制器类，它负责处理用户请求和页面展示。
//showUpdatePage 方法处理 GET 请求，将勤怠信息登记页面展示给用户。
//submitAttendance 方法处理 POST 请求，将用户提交的信息保存到数据库，并重定向到勤怠信息登记页面。
//
//showUpdatePage方法
//注解@GetMapping("/update") 表示这个方法处理来自/attendance/update路径的GET请求。
//方法签名public String showUpdatePage(Model model)告诉Spring接收Model对象，
//这是Spring用来传递数据给模板引擎的方式。
//在方法体内，model.addAttribute("attendance", new AttendanceRegistrationUpdateEntity());
//将一个新的AttendanceRegistrationUpdateEntity实例添加到模型中，以便在模板中使用。
//这将提供一个空的勤怠信息对象，用于在页面上展示和收集用户输入。
//最后，return"勤怠情報登録更新";表示返回名为[勤怠情報登録更新]的Thymeleaf模板。
//这个模板会被渲染，以展示页面给用户。

//submitAttendance方法
//注解@PostMapping("/submit")表示这个方法处理来自/attendance/submit路径的POST请求。
//方法签名public String submitAttendance
//(AttendanceRegistrationUpdateEntity attendance)
//告诉Spring接收一个AttendanceRegistrationUpdateEntity对象作为参数
//这个对象包含了用户在页面上输入的勤怠信息。
//在方法体内，attendanceService.submitAttendance(attendance);
//调用了服务层的 submitAttendance 方法，将用户输入的勤怠信息传递给它进行保存。
//最后，return "redirect:/attendance/update";
//表示当提交完成后，重定向到 showUpdatePage 方法，即返回勤怠信息登记更新页面。
