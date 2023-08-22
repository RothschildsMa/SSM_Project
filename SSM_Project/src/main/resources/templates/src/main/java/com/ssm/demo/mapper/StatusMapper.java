package com.ssm.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssm.demo.entity.Status;

@Mapper
public interface StatusMapper {
	List<Status> FindStatusName();
	

}
