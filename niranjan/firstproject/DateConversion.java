package com.niranjan.firstproject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateConversion {
	
	String returnCompleteDate(String date) {
		String[] arr = date.split(" ");
		return returnDate(arr[0])+"-"+returnMonth(arr[1])+"-"+arr[2];
	}
	
	String returnDate(String st) {
		String res = "";
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher(st);
		if(m.find())
		 res = m.group();
		if (res.length()==1) 
			return "0"+res;
		return res;
	}

	String returnMonth(String st) {
		st=st.toLowerCase();
		String res="";
		switch(st) {
		case "jan":return "01";
		case "feb":return "02";
		case "mar":return "03";
		case "apr":return "04";
		case "may":return "05";
		case "jun":return "06";
		case "jul":return "07";
		case "aug":return "08";
		case "sep":return "09";
		case "oct":return "10";
		case "nov":return "11";
		case "dec":return "12";
		}
		return res;
	}
	
	public static void main(String[] args) {
		String date="1st Jan 2025";
		DateConversion ob= new DateConversion();
		System.out.println(ob.returnCompleteDate(date));	
	}
}
