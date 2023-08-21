package com.ssm.framework.team1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.ssm.framework.team1.entity.Form;
import com.ssm.framework.team1.repository.FormRepository;



@Controller
@RequestMapping("/employee")
public class FormController {
	
	@Autowired
	private FormRepository formRepository;
	 
	@GetMapping("/")
	public String showForm() {
		return "form";
	}
	 
	@PostMapping("/submit")
    public String createForm(
    		@RequestParam("id") String id, 
    		@RequestParam("name") String name, 
    		@RequestParam("department") String department,
    		@RequestParam("gender") String gender,
    		@RequestParam("telephone") String telephone,
    		@RequestParam("date") String date,
    		@RequestParam("age") String age,
    		@RequestParam("address") String address) {
		Form form = new Form();
		form.setEMPLOYEE_ID(id);
		form.setEMPLOYEE_NAME(name);
		form.setDEPT_ID(department);
		form.setGENDER_ID(gender);
		form.setTELEPHONE_NUMBER(telephone);
		form.setENTRY_DATE(date);
		form.setAGE(age);
		form.setMAIL_ADDRESS(address);
		formRepository.save(form);

//		if (form.getEmployeeId() == null || form.getEmployeeId().isEmpty() ||
//				form.getName() == null || form.getName().isEmpty() ||
//				form.getDepartment() == null || form.getDepartment().isEmpty() ||
//				form.getAddress() == null || form.getAddress().isEmpty()) {
//			 return "result-failure";
//		}

		return "redirect:/employeelist";
    }
}