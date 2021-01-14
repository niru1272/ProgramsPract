package com.niranjan.firstproject;


public class ExcelsheetColumntoDigit {

	public static void main(String[] args) {
		
		String str = "FXSHRXW";
		int sum=0, l=str.length();
		for(int i=0;i<str.length();i++) {
			sum+=Math.pow(26, l-1)*(str.charAt(i)-64);
			l--;
		}
		System.out.println(sum);
	}

}
