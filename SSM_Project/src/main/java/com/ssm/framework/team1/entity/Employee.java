package com.ssm.framework.team1.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class Employee implements Serializable {
	private String employeeId;
	private String dateFrom;
	private String dateTo;
	private String entryDate;
	private String employeeName;
	private String genderId;
	private String age;
	private String deptId;
	private String mailAddress;
}
