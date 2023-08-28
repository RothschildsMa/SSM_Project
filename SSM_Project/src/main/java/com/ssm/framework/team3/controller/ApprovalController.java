package com.ssm.framework.team3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ssm.framework.team3.entity.Approval;
import com.ssm.framework.team3.form.Team3SearchForm;
import com.ssm.framework.team3.service.ApprovalService;

@Controller
public class ApprovalController {

	@Autowired
	private ApprovalService approvalService;

	@GetMapping("/approval")
	public String view1(Team3SearchForm team3SearchForm, Model model) {
		List<Approval> approvalList = approvalService.getAllApproval();
		model.addAttribute("approvalList", approvalList);
		return "view";
	}

	@PostMapping("search")
	public String view2(Team3SearchForm team3SearchForm, Model model) {
		List<Approval> approvalList = approvalService.searchApproval(team3SearchForm);
		model.addAttribute("approvalList", approvalList);
		return "view";
	}
	
	@PostMapping("logout")
	public String testView2(String id, String name, Model model) {
		model.addAttribute("ID", id);
		model.addAttribute("name", name);
		return "view2";
	}

	@PostMapping("close")
	public String testView3(String id, String name, Model model) {
		model.addAttribute("ID", id);
		model.addAttribute("name", name);
		return "view2";
	}
}