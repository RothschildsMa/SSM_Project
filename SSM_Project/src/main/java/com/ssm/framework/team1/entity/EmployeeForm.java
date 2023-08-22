package com.ssm.framework.team1.entity;

import lombok.Data;

@Data
public class EmployeeForm {

	private String EMPLOYEE_ID;
	private String EMPLOYEE_NAME;
	private String DEPT_ID;
	private String GENDER_ID = "G00";
	private String TELEPHONE_NUMBER;
	private String ENTRY_DATE;
	private String AGE;
	private String MAIL_ADDRESS;
}
