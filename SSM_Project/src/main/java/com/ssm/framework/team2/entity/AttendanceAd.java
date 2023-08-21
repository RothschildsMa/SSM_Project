package com.ssm.framework.team2.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class AttendanceAd {
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
}