package com.ssm.framework.team2.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssm.framework.team2.entity.AmData;

//Author Chin

@Mapper
public interface AmInfoMapper {

	
	List<AmData> findWorkingDays();
	List<AmData> findattendanceDays();
	List<AmData> findAinfo();

}
