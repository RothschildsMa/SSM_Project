package com.ssm.framework.team1.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssm.framework.team1.entity.Form;


@Mapper
public interface FormMapper {
	List<Form> findall();
																																																																																												
}
