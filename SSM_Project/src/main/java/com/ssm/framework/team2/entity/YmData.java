package com.ssm.framework.team2.entity;

import java.io.Serializable;

import lombok.Data;

@SuppressWarnings("serial")
@Data
public class YmData implements Serializable{
	
	private String attendanceYear;
	private String attendanceMonth;

}
