package com.ssm.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.demo.entity.Attendance;
import com.ssm.demo.form.SearchForm;
import com.ssm.demo.mapper.ATTMapper;

@Service
public class ATTDAYService {

	@Autowired
	private ATTMapper attMapper;

	public List<Attendance> getAttendanceById(String id) {
		return attMapper.findById(id);
		// 通过ID获取特定勤怠信息
	}

	public List<Attendance> searchAttendance(SearchForm searchForm) {

		searchForm.setEmployeeId("001");

		return attMapper.search(searchForm);
		// 通过ID获取特定勤怠信息
	}

	public void deleteByDate(String employeeId, String attendanceDate) {
		attMapper.logicalDelete(employeeId, attendanceDate);

	}
}
//【包名和导入语句】
//该程序位于com.ssm.demo.service 包中
//使用了Spring的@Service注解，表明这是一个服务层的组件。
//导入了相关的类以便使用它们。
//【注入DAO】
//使用@Autowired注解将名为attdayDao的ATTDAYDAO对象注入到该服务类中。
//这是通过依赖注入方式实现的，允许您在服务类中使用ATTDAYDAO提供的数据库操作功能。
//【getAttendanceById方法】
//这个方法接受一个Longid参数，表示要获取的勤怠信息的ID。
//它调用attdayDao的findById方法
//该方法在ATTDAYDAO接口中定义。用于从数据库中根据ID查找勤怠信息。
//然后，该方法返回查找到的ATTUpdateEntity实体，包含了勤怠信息的详细内容。
//【deleteAttendanceById方法】
//这个方法接受一个Longid参数，表示要删除的勤怠信息的ID。
//它调用attdayDao的deleteById方法
//该方法在ATTDAYDAO接口中定义，用于从数据库中根据ID删除勤怠信息。
//这个服务类充当了业务逻辑的中间层
//它通过注入ATTDAYDAO实例来执行与数据库相关的操作
//包括获取特定ID的勤怠信息以及删除特定ID的勤怠信息。
//这种分层的设计模式有助于将业务逻辑与数据库访问逻辑分开，提高了代码的可维护性和可测试性。

//【@Service注解】
//这是Spring的注解，用于标识一个类为服务类。
//它告诉Spring框架将这个类注册为应用的一个服务组件，使其可被其他组件引用和使用。
//【@Autowired注解】
//这是Spring的注解，用于自动注入依赖。
//在这里，它将一个名为attdayDao的ATTDAYDAO实例注入到ATTDAYService类中。
