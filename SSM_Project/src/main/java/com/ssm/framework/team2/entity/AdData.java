package com.ssm.framework.team2.entity;

import lombok.Data;

@Data
public class AdData {
	 private String attendanceDate;
	    private String startTime;
	    private String endTime;
	    private double restHours;
	    private double overtimeHours;
	    private double workingHours;
	    private String statusName;
	    private String remarks; 
}
