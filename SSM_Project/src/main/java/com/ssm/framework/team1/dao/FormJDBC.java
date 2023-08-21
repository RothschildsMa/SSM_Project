package com.ssm.framework.team1.dao;

import java.sql.*;
import java.util.*;

import com.ssm.framework.team1.entity.Form;

public class FormJDBC {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://153.127.34.246:13306/db1","root","password");
			Statement stmt = con.createStatement();
			
			ResultSet qry = stmt.executeQuery("SELECT * FROM T_EMPLOYEE;");
			List<Form> forms = new ArrayList<>();
			
			while(qry.next()) {
				Form form = new Form();
				form.setEmployeeId(qry.getString(1));
				form.setName(qry.getString(2));
				form.setDepartment(qry.getString(6));
				form.setGender(qry.getString(4));
				form.setTelephone(qry.getString(7));
				form.setDate(qry.getString(14));
				form.setAge(qry.getString(5));
				form.setAddress(qry.getString(8));

				forms.add(form);
			}
			System.out.println(forms.get(0).toString());
			System.out.println(forms.get(1).toString());
			System.out.println(forms.get(2).toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
	}

}
