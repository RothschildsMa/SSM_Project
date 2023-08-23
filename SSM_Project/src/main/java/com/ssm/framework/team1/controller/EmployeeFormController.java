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
	    public String showCreateFormPage(Model model) {
	        EmployeeForm newEmployee = new EmployeeForm();
	        
			String newId = employeeFormService.getNewEmployeeId();
	        newEmployee.setEMPLOYEE_ID(newId);
	        
	        setDifferentFormModel(model,newEmployee,true);
	        return "employeeForm";
	    }

		// 更新用
		@GetMapping("/form/{EMPLOYEE_ID}")
		public String showUpdateFormPage(@PathVariable String EMPLOYEE_ID, Model model){
			EmployeeForm existingEmployee = employeeFormService.getEmployeeById(EMPLOYEE_ID);
			
			setDifferentFormModel(model,existingEmployee,false);
			return "employeeForm";
			
		}
		
		public void setDifferentFormModel (Model model,EmployeeForm employeeForm,boolean isNewEntry) {
				model.addAttribute("employeeForm", employeeForm);
		        model.addAttribute("isNewEntry", isNewEntry);
		}
	
		@PostMapping("/submit")
		public String createOrUpdateEmployee(@Valid EmployeeForm employeeForm, 
				BindingResult bindingResult, @RequestParam("button") String button) {
			
			if ("登録".equals(button)) {
				employeeForm.setEMPLOYEE_ID(employeeFormService.getNewEmployeeId());
				employeeFormService.createEmployee(employeeForm);

			} else if ("修正".equals(button)) {
		        employeeFormService.updateEmployee(employeeForm);
		    }
	
			return "redirect:/employeelist";
		}

}