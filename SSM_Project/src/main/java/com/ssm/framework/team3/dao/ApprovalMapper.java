package com.ssm.framework.team3.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssm.framework.team3.entity.Approval;
import com.ssm.framework.team3.form.Team3SearchForm;

@Mapper
public interface ApprovalMapper {

	List<Approval> findall();

	List<Approval> findApprovals(Team3SearchForm team3SearchForm);
}