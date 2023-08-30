package com.ssm.framework.team1.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.ssm.framework.team1.dao.DeptMapper;
import com.ssm.framework.team1.entity.Dept;
import com.ssm.framework.team1.entity.Employee;
import com.ssm.framework.team1.form.SearchForm;
import com.ssm.framework.team1.service.ListService;




@Controller
public class ListController {
	
	@Autowired
	private ListService listService;
	
	@Autowired
	private DeptMapper deptMapper;
	
	@GetMapping("/employeelist")
	public String listView(SearchForm searchForm,Model model) {
		List<Employee> employeeList = listService.getAllEmployee();
		List<Dept> deptList = deptMapper.FindDeptName();
		
		model.addAttribute("deptList", deptList);
		model.addAttribute("employeeList", employeeList);
		return "list";
	}
	

	@GetMapping("/search")
	public String search1(SearchForm searchForm,Model model) {
		

		String selectedDeptId = searchForm.getDeptId();
		String selectedEmployeeId = searchForm.getEmployeeId();
		String fromDate = searchForm.getDateFrom();
		String toDate = searchForm.getDateTo();
		
		List<Dept> deptList = deptMapper.FindDeptName();
		
		List<Employee> employeeList = listService.searchEmployee(selectedDeptId,selectedEmployeeId,fromDate,toDate);
		
		model.addAttribute("deptList", deptList);
		model.addAttribute("employeeList", employeeList);
		
		
		return "list";
	}
	
	
	@DeleteMapping("/delete")
	   public String deleteEmployee(@PathVariable("employeeId") String employeeId, Model model) {
		List<Employee> employeeList = listService.deleteEmployeeById(employeeId);
		model.addAttribute("employeeList", employeeList);
	      return "list";
	   }
	
}
