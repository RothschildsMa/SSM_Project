package com.ssm.framework.team1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.ssm.framework.team1.entity.EmployeeForm;
import com.ssm.framework.team1.service.EmployeeFormService;



@Controller
@RequestMapping("/employee")
public class EmployeeFormController {
	
	@Autowired
    private EmployeeFormService employeeFormService;
	
	// 登録用
	@GetMapping("/form")
    public String showCreateFormPage(Model model) {
		String maxId = employeeFormService.getMaxEmployeeId();
        String newId = generateNextId(maxId);
        
        EmployeeForm newEmployee = new EmployeeForm();
        newEmployee.setEMPLOYEE_ID(newId);
        
        model.addAttribute("employeeForm", newEmployee);
        model.addAttribute("isNewEntry", true);
        
        return "employeeForm";
    }
	
	// 更新用
	@GetMapping("/form/{EMPLOYEE_ID}")
	public String showUpdateFormPage(@PathVariable String EMPLOYEE_ID, Model model) {
	    EmployeeForm existingEmployee = employeeFormService.getEmployeeById(EMPLOYEE_ID);
	    if (existingEmployee == null) {
	        // 处理员工不存在的情况
	        return "error"; // 或其他错误页面
	    } else {

	        model.addAttribute("employeeForm", existingEmployee);
	        model.addAttribute("isNewEntry", false); // 标记为非新建
	        return "employeeForm";
	    }
	}

	@PostMapping("/submit")
	public String createOrUpdateEmployee(EmployeeForm employeeForm, @RequestParam("button") String button) {
	    if ("登録".equals(button)) {
	        String maxId = employeeFormService.getMaxEmployeeId();
	        String newId = generateNextId(maxId);
	        
	        employeeForm.setEMPLOYEE_ID(newId);
	        employeeFormService.createEmployee(employeeForm);
	        
	    } else if ("修正".equals(button)) {
	        employeeFormService.updateEmployee(employeeForm);
	    }
	
	    return "redirect:/employeelist";
	}

//		if (form.getEmployeeId() == null || form.getEmployeeId().isEmpty() ||
//				form.getName() == null || form.getName().isEmpty() ||
//				form.getDepartment() == null || form.getDepartment().isEmpty() ||
//				form.getAddress() == null || form.getAddress().isEmpty()) {
//			 return "result-failure";
//		}

	private String generateNextId(String maxId) {
        if (maxId == null || maxId.isEmpty()) {
            return "E0001"; 
        }
        
        int number = Integer.parseInt(maxId.substring(1));
        number++;
        
        String newId = "E" + String.format("%04d", number);
        return newId;
    }

}