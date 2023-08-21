package com.ssm.framework.team1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.ssm.framework.team1.entity.Form;



@Controller
@RequestMapping("/employee")
public class FormController {
	
	@GetMapping("/create")
	public String createForm(@ModelAttribute("form") Form form) {
		return "form"; 
	}
	 
	@PostMapping("/create")
    public String saveEmployee(@ModelAttribute("form") Form form) {
		if (form.getEmployeeId() == null || form.getEmployeeId().isEmpty() ||
				form.getName() == null || form.getName().isEmpty() ||
				form.getDepartment() == null || form.getDepartment().isEmpty() ||
				form.getAddress() == null || form.getAddress().isEmpty()) {
			 return "result-failure";
		}

        return "result-success"; 
    }
}