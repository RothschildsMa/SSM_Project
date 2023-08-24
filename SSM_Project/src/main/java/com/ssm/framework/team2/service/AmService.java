package com.ssm.framework.team2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.framework.team2.dao.AmInfoMapper;
import com.ssm.framework.team2.entity.AmData;
import com.ssm.framework.team2.form.AddForm;

//Author Chin

@Service
public class AmService {
	@Autowired
	private AmInfoMapper mapper;

	public List<AmData> getWorkingDays() {
		return mapper.findWorkingDays();
	}
	
	public List<AmData> getAttendanceDays() {
		return mapper.findAttendanceDays();
	}
	
	public List<AmData> getAmInfo() {
		return mapper.findAmInfo();
	}

	public void insert(AddForm form) {
//		form.setEmployeeId("E001");
//		form.setWorkingHours(1.5);
//		form.setAbsenceHours(1.0);
//		form.setStatusId(1);

		mapper.add(form);
	}

	public void update(AddForm addForm) {
		// TODO Auto-generated method stub
		
	}

}
