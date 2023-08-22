package com.ssm.framework.team2.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssm.framework.team2.entity.Status;

@Mapper
public interface StatusMapper {

    
    List<Status> FindStatusName();

    
}