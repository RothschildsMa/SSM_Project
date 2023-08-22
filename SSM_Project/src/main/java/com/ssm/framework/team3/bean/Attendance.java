package com.ssm.framework.team3.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Attendance implements Serializable {

	private static final long serialVersionUID = 1L;
	/*
	 * EMPLOYEE_ID varchar(10) PK ATTENDANCE_DATE varchar(10) PK START_TIME
	 * varchar(5) END_TIME varchar(5) REST_HOURS decimal(4,2) WORKING_HOURS
	 * decimal(4,2) OVERTIME_HOURS decimal(4,2) ABSENCE_HOURS decimal(4,2) STATUS_ID
	 * int REMARKS varchar(200) DEL_FLG int CREATE_DATE datetime CREATE_USER
	 * varchar(10) UPDATE_DATE datetime UPDATE_USER
	 */
	private String employeeId;
	private String attendanceDate;
	private String startTime;
	private String endTime;
	private BigDecimal restHours;
	private BigDecimal workingHours;
	private BigDecimal overTimeHours;
	private BigDecimal absenceHours;
	private int statusId;
	private String remarks;
	private int delFlg;
	private Date createDate;
	private String createUser;
	private Date updateDate;
	private String updateUser;

	private BigDecimal sumWork;
	private BigDecimal sumOver;
	
	private String statusName;
	
	private String weekDay;

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getAttendanceDate() {
		return attendanceDate;
	}

	public void setAttendanceDate(String attendanceDate) {
		this.attendanceDate = attendanceDate;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public BigDecimal getRestHours() {
		return restHours;
	}

	public void setRestHours(BigDecimal restHours) {
		this.restHours = restHours;
	}

	public BigDecimal getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(BigDecimal workingHours) {
		this.workingHours = workingHours;
	}

	public BigDecimal getOverTimeHours() {
		return overTimeHours;
	}

	public void setOverTimeHours(BigDecimal overTimeHours) {
		this.overTimeHours = overTimeHours;
	}

	public BigDecimal getAbsenceHours() {
		return absenceHours;
	}

	public void setAbsenceHours(BigDecimal absenceHours) {
		this.absenceHours = absenceHours;
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public int getDelFlg() {
		return delFlg;
	}

	public void setDelFlg(int delFlg) {
		this.delFlg = delFlg;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public BigDecimal getSumWork() {
		return sumWork;
	}

	public void setSumWork(BigDecimal sumWork) {
		this.sumWork = sumWork;
	}

	public BigDecimal getSumOver() {
		return sumOver;
	}

	public void setSumOver(BigDecimal sumOver) {
		this.sumOver = sumOver;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	

	public String getWeekDay() {
		return weekDay;
	}

	public void setWeekDay(String weekDay) {
		this.weekDay = weekDay;
	}

	@Override
	public String toString() {
		return "Attendance [employeeId=" + employeeId + ", attendanceDate=" + attendanceDate + ", startTime="
				+ startTime + ", endTime=" + endTime + ", restHours=" + restHours + ", workingHours=" + workingHours
				+ ", overTimeHours=" + overTimeHours + ", absenceHours=" + absenceHours + ", statusId=" + statusId
				+ ", remarks=" + remarks + ", delFlg=" + delFlg + ", createDate=" + createDate + ", createUser="
				+ createUser + ", updateDate=" + updateDate + ", updateUser=" + updateUser + ", sumWork=" + sumWork
				+ ", sumOver=" + sumOver + ", statusName=" + statusName + ", weekDay=" + weekDay + "]";
	}

	

	
}
