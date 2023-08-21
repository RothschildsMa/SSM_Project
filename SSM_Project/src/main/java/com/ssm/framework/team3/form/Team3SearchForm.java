package com.ssm.framework.team3.form;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Getter
@Setter
public class Team3SearchForm implements Serializable {
	private String employeeId;
	private String deptId;
	private String employeeName;
	private String statusId;
	private String entryDateFrom;
	private String entryDateTo;
}
