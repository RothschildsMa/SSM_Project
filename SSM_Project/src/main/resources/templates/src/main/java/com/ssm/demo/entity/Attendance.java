package com.ssm.demo.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class Attendance implements Serializable{

	private String employeeId;
	private String attendanceDate;
	private String startTime;
	private String endTime;
	private double restHours;
	private double workingHours;
	private double overtimeHours;
	private double absenceHours;
	private String statusName;
	private String remarks;
	
}
