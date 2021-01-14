package com.niranjan.firstproject;

public class ReversingString{
	public String reverse(String str){
		String rev="";
		int l= str.length()-1;
		for (int i=l;i>=0 ;i--)
			rev=rev+str.charAt(i);
		return rev;
	}

	public static void main(String[] args) {
		String str = "Niranjan";
		ReversingString obj = new ReversingString();
		System.out.println(obj.reverse(str));
	}
}