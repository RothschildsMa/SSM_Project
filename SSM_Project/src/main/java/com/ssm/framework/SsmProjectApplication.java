package com.ssm.framework;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages={
		"com.ssm.framework.team1.dao",
		"com.ssm.framework.team2.dao",
		"com.ssm.framework.team3.mapper"})
public class SsmProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsmProjectApplication.class, args);
	}
}
