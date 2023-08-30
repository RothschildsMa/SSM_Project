package com.ssm.framework.team2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ssm.framework.team2.form.AddForm;
import com.ssm.framework.team2.service.AmService;
import com.ssm.framework.team2.service.RefreshService;

@Controller
public class RefreshController {

	@Autowired
	private RefreshService refreshService;

	@GetMapping("/refresh")
	public String test(AddForm addForm,Model model) {
		model.addAttribute("refresh",true);

		return "refresh";
	}

	@PostMapping("/insert")
	public String test2(@Validated AddForm addForm,BindingResult result,Model model) {
		model.addAttribute("refresh",true);

		if (result.hasErrors()){
			
			
			return"refresh";
		}

		addForm.setEmployeeId("E1000");

		refreshService.insert(addForm);

		return "redirect:/attendance_day";
	}

	@GetMapping("/add/{date}/update")
	public String showUpdatePage(@PathVariable String date, Model model, AddForm addForm) {
		model.addAttribute("update",true);

		refreshService.updateAttendance(addForm, date);
		return "refresh";
	}

	@PostMapping("/update")
	public String test3(AddForm addForm) {

		refreshService.update(addForm);

		return "redirect:/attendance_day";

	}

}
