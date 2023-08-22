package com.ssm.framework.team2.dao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ssm.framework.team2.entity.AdUpdateEntity;

@Mapper
public class AdMapper{

	
	public interface AdDay {
	    AdUpdateEntity findById(@Param("id") Long id);
	    void deleteById(@Param("id") Long id);
	}
}
