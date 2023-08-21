package com.ssm.framework.team2.form;

import java.io.Serializable;

import lombok.Data;

@Data
public class AddForm implements Serializable{
	private String employeeId;
	private String attendanceDate;
	private String startTime;
	private String endTime;
	private double restHours;
	private double workingHours;
	private double overtimeHours;
	private double absenceHours;
	private Integer statusId;
	private String remarks;

}
