package com.ssm.framework.team1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import com.ssm.framework.team1.entity.EmployeeForm;
import com.ssm.framework.team1.service.EmployeeFormService;

import jakarta.validation.Valid;


@Controller
@RequestMapping("/employee")
public class EmployeeFormController {
	
	@Autowired
    private EmployeeFormService employeeFormService;
	
		// 登録用
		@GetMapping("/form")
	    public String showCreateFormPage(@ModelAttribute("employeeForm") EmployeeForm employeeForm) {   
			String newId = employeeFormService.getNewEmployeeId();
			employeeForm.setEMPLOYEE_ID(newId);
			employeeForm.setIsNewEntry(true);
	        return "employeeForm";
	    }

		// 更新用
		@GetMapping("/form/{EMPLOYEE_ID}")
		public String showUpdateFormPage(@PathVariable String EMPLOYEE_ID, Model model){
			EmployeeForm existingEmployee = employeeFormService.getEmployeeById(EMPLOYEE_ID);
			model.addAttribute("employeeForm",existingEmployee);
			return "employeeForm";
			
		}

		@PostMapping("/submit")
		public String createOrUpdateEmployee(@Valid EmployeeForm employeeForm,
				BindingResult bindingResult, @RequestParam("button") String button) {

			if ("登録".equals(button)) {
				if (bindingResult.hasErrors()) {
		            return "employeeForm";
		        }
				employeeFormService.createEmployee(employeeForm);

			} else if ("修正".equals(button)) {
				if (bindingResult.hasErrors()) {
		            return "employeeForm";
		        }
		        employeeFormService.updateEmployee(employeeForm);
		    }

			return "redirect:/employeelist";
		}
}