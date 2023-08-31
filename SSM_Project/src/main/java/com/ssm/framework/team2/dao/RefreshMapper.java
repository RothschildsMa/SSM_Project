package com.ssm.framework.team2.dao;

import org.apache.ibatis.annotations.Mapper;

import com.ssm.framework.team2.entity.Attendance;
import com.ssm.framework.team2.form.AddForm;

@Mapper
public interface RefreshMapper {
	void add(AddForm form);
	Attendance findByDate(String employeeId,String attendanceDate);
	void update(AddForm addForm);

}
