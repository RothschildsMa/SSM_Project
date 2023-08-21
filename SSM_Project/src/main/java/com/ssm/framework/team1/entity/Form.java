package com.ssm.framework.team1.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class Form implements Serializable {

	private static final long serialVersionUID = 1L;
	private String employeeId;
	private String name;
	private String department;
	private String gender;
	private String telephone;
	private String date;
	private String age;
	private String address;

	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", department=" + department + ", gender="
				+ gender + ", telephone=" + telephone + ", date=" + date + ", age=" + age + ", address=" + address
				+ "]";
	}
}

