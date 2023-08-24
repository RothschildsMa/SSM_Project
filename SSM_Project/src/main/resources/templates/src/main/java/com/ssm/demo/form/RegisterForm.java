package com.ssm.demo.form;
import java.io.Serializable;

import lombok.Data;

@Data
public class RegisterForm implements Serializable{

	private String employeeId;
	private String attendanceDate;
	private String startTime;
	private String endTime;
	private double restHours;
	private double workingHours;
	private double overtimeHours;
	private double absenceHours;
	private String statusId;
	private String remarks;
	
//	CREATE_DATE date 
//	CREATE_USER varchar(10) 
//	UPDATE_DATE date 
//	UPDATE_USER varchar(10)
}
//【@Data注解】
//这是Lombok提供的注解，用于自动生成getter、setter、toString、equals等通用方法。
//通过添加@Data注解，可以简化Java类的代码。
//【每个属性的注释： 注释说明了每个属性的用途。】
//employeeId：表示员工的唯一标识。
//attendanceDate：表示考勤的日期。
//startTime：表示上班的时间。
//endTime：表示下班的时间。
//restHours：表示休息的时间。
//workingHours：表示工作的时间。
//overtimeHours：表示加班的时间。
//absenceHours：表示缺勤的时间。
//statusId：表示状态的标识。
//remarks：表示备注信息。