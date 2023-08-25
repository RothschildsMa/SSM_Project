package com.ssm.framework.team2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ssm.framework.team2.dao.RefreshMapper;
import com.ssm.framework.team2.form.AddForm;

@Service
public class RefreshService {
	@Autowired
	private RefreshMapper mapper;
	public void insert(AddForm form) {
//		form.setEmployeeId("E001");
//		form.setWorkingHours(1.5);
//		form.setAbsenceHours(1.0);
//		form.setStatusId(1);

		mapper.add(form);
	}

	public void update(AddForm form) {
//		form.setEmployeeId("E001");
//		form.setWorkingHours(1.5);
//		form.setAbsenceHours(1.0);
//		form.setStatusId(1);

		mapper.add(form);
	}
}
