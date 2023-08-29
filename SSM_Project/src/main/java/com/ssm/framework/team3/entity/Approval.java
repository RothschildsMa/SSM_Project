package com.ssm.framework.team3.entity;

import java.io.Serializable;

import lombok.Data;

@SuppressWarnings("serial")
@Data
public class Approval implements Serializable {
	private String employeeId;
	private String entryDate;
	private String entryDateFrom;
	private String entryDateTo;
	private String employeeName;
	private String deptId;
	private String workingHours;
	private String restHours;
	private String overtimeHours;
	private String absenceHours;
	private String statusId;
	private String statusName;
}
