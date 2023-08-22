package com.ssm.framework.team2.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssm.framework.team2.entity.AmData;
import com.ssm.framework.team2.form.AddForm;

//Author Chin

@Mapper
public interface AmInfoMapper {

	List<AmData> findWorkingDays();

	List<AmData> findAttendanceDays();

<<<<<<< HEAD
	List<AmData> findinfo();
	
=======
	List<AmData> findAInfo();

>>>>>>> branch 'main' of https://github.com/RothschildsMa/SSM_Project.git
	void add(AddForm form);

}
