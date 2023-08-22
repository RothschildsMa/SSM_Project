package com.ssm.framework.team2.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.ssm.framework.team2.entity.Status;

@Mapper
public interface StatusMapper {

    @Select("SELECT * FROM M_STATUS")
    List<Status> findStatusName();

    
}