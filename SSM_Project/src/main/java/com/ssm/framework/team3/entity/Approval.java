package com.ssm.framework.team3.entity;

import java.io.Serializable;

import lombok.Data;

@SuppressWarnings("serial")
@Data
public class Approval implements Serializable {
	private String employeeId;
	private String attendanceym;
	private String employeename;
	private String deptid;
	private String workinghours;
	private String resthours;
	private String overtimehours;
	private String absencehours;
	private String statusid;
}
