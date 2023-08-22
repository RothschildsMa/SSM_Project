package com.ssm.framework.team2.service;

import org.hibernate.mapping.List;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class AdService {

	public static void main(String[] args) {
		SpringApplication.run(AdService.class, args);
	}
@GetMapping()
	public static List getAttendanceById(String string) {
		
		return null;
	}

}