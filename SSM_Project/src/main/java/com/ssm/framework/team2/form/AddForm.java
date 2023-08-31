package com.ssm.framework.team2.form;

import java.io.Serializable;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AddForm implements Serializable{
	private String employeeId;
	
	@NotBlank(message = "日付を入力してください")
	private String attendanceDate;
	private String startTime;
	private String endTime;
	private double restHours;
	private double workingHours;
	private double overtimeHours;
	private double absenceHours;
	//@NotBlank(message = "状態を選択してください")
	private Integer statusId;
	private String remarks;
	private String content;
	private String reason;

}
