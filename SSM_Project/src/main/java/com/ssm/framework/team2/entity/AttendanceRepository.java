package com.ssm.framework.team2.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssm.framework.team3.bean.Attendance;

public class AttendanceRepository {
	public interface AttendanceAd extends JpaRepository<Attendance, Long> {
	}

	public List<Attendance> findAll() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
}
