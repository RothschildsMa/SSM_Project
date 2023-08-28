package com.ssm.framework.team2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.framework.team2.dao.AmInfoMapper;
import com.ssm.framework.team2.dao.YmMapper;
import com.ssm.framework.team2.entity.AmData;
import com.ssm.framework.team2.entity.YmData;

//Author Chin

@Service
public class AmService {
	@Autowired
	private YmMapper ymmapper;

	@Autowired
	private AmInfoMapper mapper;

	public List<AmData> getWorkingDays(String selectedYear) {
		return mapper.findWorkingDays(selectedYear);
	}

	public List<AmData> getAmInfo(String selectedYear) {
		return mapper.findAmInfo(selectedYear);
	}

	public List<String> getYear() {
		return ymmapper.findYear();
	}

	public List<YmData> getYM() {
		return ymmapper.findYM();
	}

}
