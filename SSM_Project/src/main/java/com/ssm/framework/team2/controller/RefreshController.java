package com.ssm.framework.team2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ssm.framework.team2.form.AddForm;
import com.ssm.framework.team2.service.AmService;

@Controller
public class RefreshController {

	@Autowired
	private AmService amService;

	@GetMapping("/refresh")
	public String test(AddForm addForm) {

		return "refresh";
	}

	@PostMapping("/insert")
	public String test2(AddForm addForm) {

		addForm.setEmployeeId("E1000");

		amService.insert(addForm);

		return "redirect:/attendance_day";
	}

		@PostMapping("/update")
		public String test3(AddForm addForm) {
		
				  
			amService.update(addForm);

			return "redirect:/attendance_day";
}

}
