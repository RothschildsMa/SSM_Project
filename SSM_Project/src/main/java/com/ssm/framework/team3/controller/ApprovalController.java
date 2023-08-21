package com.ssm.framework.team3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class ApprovalController {

	@GetMapping("approval")
	public String testView() {
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