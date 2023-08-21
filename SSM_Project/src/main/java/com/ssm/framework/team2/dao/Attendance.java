package com.ssm.framework.team2.dao;

import java.util.List;

public interface Attendance {
	public List<Attendance> getAllAttendances() {
        return attendanceRepository.findAll();
    }

    public Attendance saveAttendance(Attendance attendance) {
        return attendanceRepository.save(attendance);
    }

    public Attendance getAttendanceById(Long id) {
        return attendanceRepository.findById(id).orElse(null);
    }

    public void deleteAttendance(Long id) {
        attendanceRepository.deleteById(id);
}
