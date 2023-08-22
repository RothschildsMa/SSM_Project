package com.ssm.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssm.demo.entity.Attendance;
import com.ssm.demo.entity.Status;
import com.ssm.demo.form.RegisterForm;
import com.ssm.demo.form.SearchForm;
import com.ssm.demo.mapper.StatusMapper;
import com.ssm.demo.service.ATTDAYService;

@Controller
public class ATTDAYController {
	@Autowired
	private ATTDAYService attdayService;
	@Autowired
	private StatusMapper statusMapper;

	@GetMapping("/edit")
	public String showEditPage(SearchForm searchForm, Model model) {

		List<Attendance> attendanceList = attdayService.getAttendanceById("001");

		List<Status> statusList = statusMapper.FindStatusName();
		model.addAttribute("statusList", statusList);

		// ATTUpdateEntity attendance = attdayService.getAttendanceById(id);
		model.addAttribute("attendanceList", attendanceList);
		return "ATTDAY";
	}

	@GetMapping("/to/{date}/delete")
	public String deletePage(@PathVariable String date) {
		attdayService.deleteByDate("001", date);
		return "redirect:/edit";
	}

	@PostMapping("/search")
	public String searchAttendance(SearchForm searchForm, Model model) {
		// 【日期】和【状态】从数据库中获取符合条件的数据
		List<Attendance> searchedAttendanceList = attdayService.searchAttendance(searchForm);

		List<Status> statusList = statusMapper.FindStatusName();
		model.addAttribute("statusList", statusList);
		model.addAttribute("attendanceList", searchedAttendanceList);

		return "ATTDAY";
//返回模板显示搜索结果
	}
}
//【@Autowired注解】
//这个注解用于进行自动依赖注入，将 ATTDAYService 的实例注入到该控制器类中。
//【@GetMapping("/edit/{id}")注解】
//这个注解表示该方法会处理路径为 "/edit/{id}"的GET请求。
//【@PathVariableLongId注解】
//这个注解表示该方法参数会从路径中提取对应的参数值，并将其赋值给Id变量。
//【showEditPage方法】
//这个方法处理编辑考勤页面的请求。
//它调用attdayService的getAttendanceById方法来获取指定ID的考勤实体
//然后将实体添加到Model中，最后返回视图名"EditAttendancePage"。
//【@GetMapping("/delete/{id}")注解】
//这个注解表示该方法会处理路径为"/delete/{id}"的GET请求。
//【deleteAttendance方法】这个方法处理删除考勤记录的请求。
//它调用attdayService的deleteAttendanceById方法来删除指定ID的考勤实体
//并进行重定向到"/update"路径。