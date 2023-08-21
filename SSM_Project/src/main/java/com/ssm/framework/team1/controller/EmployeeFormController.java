package com.ssm.framework.team1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.ssm.framework.team1.entity.EmployeeForm;
import com.ssm.framework.team1.service.EmployeeFormService;



@Controller
@RequestMapping("/employee")
public class EmployeeFormController {
	
	@Autowired
    private EmployeeFormService employeeFormService;
	 
	@GetMapping("/form")
	public String showFormPage(EmployeeForm employeeForm) {
		return "employeeForm";
	}
	 
	@PostMapping("/submit")
    public String createForm(EmployeeForm employeeForm){
		employeeFormService.saveEmployee(employeeForm);

//		if (form.getEmployeeId() == null || form.getEmployeeId().isEmpty() ||
//				form.getName() == null || form.getName().isEmpty() ||
//				form.getDepartment() == null || form.getDepartment().isEmpty() ||
//				form.getAddress() == null || form.getAddress().isEmpty()) {
//			 return "result-failure";
//		}

		return "redirect:/employeelist";
    }
}