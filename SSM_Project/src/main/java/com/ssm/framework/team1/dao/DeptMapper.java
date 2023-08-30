package com.ssm.framework.team1.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssm.framework.team1.entity.Dept;

@Mapper
public interface DeptMapper {

	List<Dept> FindDeptName();
}
