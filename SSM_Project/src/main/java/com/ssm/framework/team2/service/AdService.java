package com.ssm.framework.team2.service;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.framework.team2.dao.AdMapper;
import com.ssm.framework.team2.form.SearchForm;
import com.ssm.framework.team3.bean.Attendance;

@Service
public class AdService {

	@Autowired
    private AdMapper adMapper;

    public List<Attendance> searchAttendance(SearchForm searchForm) {
        return adMapper.searchAttendance(searchForm);
    }

}