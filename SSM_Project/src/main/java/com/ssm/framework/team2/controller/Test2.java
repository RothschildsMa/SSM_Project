package com.ssm.framework.team2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class Test2 {
	@GetMapping("/refresh")
	public String test() {

		return "refresh";
	}

}
