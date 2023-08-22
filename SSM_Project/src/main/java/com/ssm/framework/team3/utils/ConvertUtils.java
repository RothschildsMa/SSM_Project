package com.ssm.framework.team3.utils;

public class ConvertUtils {
	
	private ConvertUtils() {
	
	}

	public static String convertDate(String date) {
		String temp="";
		switch(date){
		case "Sunday":
			temp= "日";
			break;
		case "Monday":
			temp= "月";
			break;
		case "Tuesday":
			temp= "火";
			break;
		case "Wednesday":
			temp= "水";
			break;
		case "Thursday":
			temp= "木";
			break;
		case "Friday":
			temp= "金";
			break;
		case "Saturday":
			temp= "土";
			break;
		default:
			break;
		}
		return temp;
	}
}
