package com.ssm.framework.team1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ssm.framework.team1.entity.Employee;
import com.ssm.framework.team1.form.SearchForm;
import com.ssm.framework.team1.service.ListService;

@Controller
public class ListController {
	
	@Autowired
	private ListService listService;
	
	@GetMapping("employeelist")
	public String listView(SearchForm searchForm,Model model) {
		List<Employee> employeeList = listService.getAllEmployee();
		
		model.addAttribute("employeeList", employeeList);
		return "list";
	}
	
	@PostMapping("search")
	public String search(SearchForm searchForm,Model model) {
		List<Employee> employeeList = listService.searchEmployee(searchForm);
		model.addAttribute("employeeList", employeeList);
		
		return "list";
	}
	
	@PostMapping("delete")
	public String listView2() {
		return "list";
	}
	
}
