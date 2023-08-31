package com.ssm.framework.team2.entity;

import lombok.Data;

@Data
public class Attendance {
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
	private String content;
	private String reason;
}
