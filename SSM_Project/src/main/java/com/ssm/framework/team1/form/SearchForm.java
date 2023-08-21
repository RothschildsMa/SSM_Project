package com.ssm.framework.team1.form;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchForm implements Serializable {
	private String employeeId;
	private String deptId;
	private String entryDateFrom;
	private String entryDateTo;
}
