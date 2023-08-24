package com.ssm.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssm.demo.entity.Attendance;
import com.ssm.demo.form.RegisterForm;
import com.ssm.demo.form.SearchForm;

@Mapper
public interface ATTMapper {

	List<Attendance> findById(String employeeId);
	
	List<Attendance> search(SearchForm searchForm);
	
	Attendance findByDate(String employeeId,String attendanceDate);
	
	void save(RegisterForm registerForm);
	
	void update(RegisterForm registerForm);
	
	void logicalDelete(String employeeId,String attendanceDate);
}
//【@Mapper注解】
//这是MyBatis的注解，用于标识一个接口为Mapper接口。
//它告诉MyBatis框架将这个接口与数据库操作关联起来，以便自动生成SQL语句并执行数据库操作。
//【save方法】
//这是一个公共方法，接受一个RegisterForm registerForm参数。
//它表示将一个注册表单数据保存到数据库中，实现了向T_ATTENDANCE表中插入新的记录的功能。
//【update方法】
//这是一个公共方法，接受一个RegisterForm registerForm参数。
//它表示更新数据库中的一条记录，将传入的注册表单数据更新到对应的记录中，实现了修改已有记录的功能。