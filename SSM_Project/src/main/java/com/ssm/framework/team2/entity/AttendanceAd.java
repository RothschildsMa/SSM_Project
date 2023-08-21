package com.ssm.framework.team2.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AttendanceAd {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date attendanceDate;
    private String startTime;
    private String endTime;
    private String restHours;
    private String overtimeHours;
    private String workingHours;
    private int status;
    private String workDescription;
	public Date getAttendanceDate() {
		return attendanceDate;
	}
	public void setAttendanceDate(Date attendanceDate) {
		this.attendanceDate = attendanceDate;
	}

    // Getters and setters

    // Constructors
}