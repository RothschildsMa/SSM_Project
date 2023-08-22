package com.ssm.framework.team2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.framework.team2.dao.AdMapper;
import com.ssm.framework.team2.entity.Attendance;
import com.ssm.framework.team2.form.SearchForm;


@Service
public class AdService {

	@Autowired
    private AdMapper adMapper;
	
	public List<Attendance> getAttendanceById(String employeeId) {
        return adMapper.findById(employeeId);
    }

    public List<Attendance> searchAttendance(SearchForm searchForm) {
        return adMapper.searchAttendance(searchForm);
    }

}