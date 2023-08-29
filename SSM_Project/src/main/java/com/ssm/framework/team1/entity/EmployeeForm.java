package com.ssm.framework.team1.entity;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class EmployeeForm {
	
	private String EMPLOYEE_ID;
	
	@NotEmpty(message = " ※ 氏名を入力してください")
	private String EMPLOYEE_NAME;
	private String DEPT_ID;
	private String GENDER_ID = "3";
	
	@Pattern(regexp = "^|0[36789]\\d{8,9}$", message = " ※ 正しい電話番号を入力してください") //非必要输入
	private String TELEPHONE_NUMBER;
	
	@NotEmpty(message = " ※ 入社年月日を入力してください")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private String ENTRY_DATE;
	
	@Min(value = 16, message = " ※ 妥当な年齢を入力してください")
	@Max(value = 65, message = " ※ 妥当な年齢を入力してください")
	private Integer AGE;
	
	@NotEmpty(message = " ※ メールアドレスを入力してください")
	@Email(message = " ※ メールアドレスは正しいフォーマットで入力してください")
	private String MAIL_ADDRESS;
	
	private boolean IsNewEntry;
}
