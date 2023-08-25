package com.ssm.framework.team2.entity;

import java.io.Serializable;

import lombok.Data;

//Author Chin

@SuppressWarnings("serial")
@Data
public class AmData implements Serializable {

//	private String month;

//	private String attendanceMonth;
//	private String attendanceYear;
	private String attYear;
	private String attMonth;
	private Integer dayCount;
	private Integer workdayCount;
	private Integer absencedayCount;
	private double absenceHours;
	private double workingHours;
	private double overtimeHours;

}
