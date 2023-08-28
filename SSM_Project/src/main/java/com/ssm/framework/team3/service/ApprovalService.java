package com.ssm.framework.team3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.framework.team3.dao.ApprovalMapper;
import com.ssm.framework.team3.entity.Approval;
import com.ssm.framework.team3.form.Team3SearchForm;

@Service
public class ApprovalService {

	@Autowired
	private ApprovalMapper mapper;

	public List<Approval> getAllApproval() {
		
		return mapper.findall();
	}

	public List<Approval> searchApproval(Team3SearchForm team3SearchForm) {
		return mapper.findApprovals(team3SearchForm);
	}
}
