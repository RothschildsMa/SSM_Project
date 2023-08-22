package com.ssm.demo.form;

import java.io.Serializable;

import lombok.Data;

@Data
public class SearchForm implements Serializable{
	private String employeeId;
	private String attendanceDate;
	private String statusId;
	
}
