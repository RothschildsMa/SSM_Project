package com.ssm.framework.team2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ssm.framework.team2.form.AddForm;
import com.ssm.framework.team2.service.AmService;
import com.ssm.framework.team2.service.RefreshService;

@Controller
public class RefreshController {

	@Autowired
	private RefreshService refreshService;

	@GetMapping("/refresh")
	public String test(AddForm addForm) {

		return "refresh";
	}

	@PostMapping("/insert")
	public String test2(AddForm addForm) {

		addForm.setEmployeeId("E1000");

		refreshService.insert(addForm);

		return "redirect:/attendance_day";
	}

		@PostMapping("/update")
		public String test3(AddForm addForm) {
		
				  
			refreshService.update(addForm);

			return "redirect:/attendance_day";
}

}
