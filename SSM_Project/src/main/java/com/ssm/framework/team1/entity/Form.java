package com.ssm.framework.team1.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "t_employee")
public class Form {

	@Id
	@GeneratedValue
	private String EMPLOYEE_ID;
	private String EMPLOYEE_NAME;
	private String DEPT_ID;
	private String GENDER_ID;
	private String TELEPHONE_NUMBER;
	private String ENTRY_DATE;
	private String AGE;
	private String MAIL_ADDRESS;

	public String getEMPLOYEE_ID() {
		return EMPLOYEE_ID;
	}
	public void setEMPLOYEE_ID(String eMPLOYEE_ID) {
		EMPLOYEE_ID = eMPLOYEE_ID;
	}
	public String getEMPLOYEE_NAME() {
		return EMPLOYEE_NAME;
	}
	public void setEMPLOYEE_NAME(String eMPLOYEE_NAME) {
		EMPLOYEE_NAME = eMPLOYEE_NAME;
	}
	public String getDEPT_ID() {
		return DEPT_ID;
	}
	public void setDEPT_ID(String dEPT_ID) {
		DEPT_ID = dEPT_ID;
	}
	public String getGENDER_ID() {
		return GENDER_ID;
	}
	public void setGENDER_ID(String gENDER_ID) {
		GENDER_ID = gENDER_ID;
	}
	public String getTELEPHONE_NUMBER() {
		return TELEPHONE_NUMBER;
	}
	public void setTELEPHONE_NUMBER(String tELEPHONE_NUMBER) {
		TELEPHONE_NUMBER = tELEPHONE_NUMBER;
	}
	public String getENTRY_DATE() {
		return ENTRY_DATE;
	}
	public void setENTRY_DATE(String eNTRY_DATE) {
		ENTRY_DATE = eNTRY_DATE;
	}
	public String getAGE() {
		return AGE;
	}
	public void setAGE(String aGE) {
		AGE = aGE;
	}
	public String getMAIL_ADDRESS() {
		return MAIL_ADDRESS;
	}
	public void setMAIL_ADDRESS(String mAIL_ADDRESS) {
		MAIL_ADDRESS = mAIL_ADDRESS;
	}
}
	
