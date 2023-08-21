package com.ssm.framework.team1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.framework.team1.dao.FormMapper;
import com.ssm.framework.team1.entity.Form;

@Service
public class FormService {
	
	@Autowired
	private FormMapper mapper;
	
	public List<Form> getAllEmployee(){
		return mapper.findall();
	}
}
