package com.ssm.framework.team2.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssm.framework.team2.entity.YmData;

@Mapper
public interface YmMapper {

	List<YmData> findYM();

	List<String> findYear();

}
