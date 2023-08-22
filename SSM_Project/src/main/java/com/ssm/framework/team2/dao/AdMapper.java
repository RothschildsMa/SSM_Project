package com.ssm.framework.team2.dao;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ssm.framework.team2.form.SearchForm;
import com.ssm.framework.team3.bean.Attendance;


@Mapper
public interface AdMapper {
    List<Attendance> searchAttendance(@Param("searchForm") SearchForm searchForm);
    
}
