package com.niranjan.firstproject;

public class ReverseEachWordOfSentance {

	String reverseString(String str) {
		String rev="";
		int l= str.length()-1;
		for (int i=l;i>=0 ;i--)
			rev=rev+str.charAt(i);
		return rev;

	}

	String splitSentence(String sent) {
		String[] strs = sent.split(" ");
		int l = strs.length;
		String finalOutput = "";
		for (int i = 0; i < l; i++) {
			finalOutput += reverseString(strs[i])+ " ";
		}
		return finalOutput;
	}

	public static void main(String[] args) {
		String subject = "Niranjan the great hero";
		ReverseEachWordOfSentance obj = new ReverseEachWordOfSentance();
		System.out.println(obj.splitSentence(subject));
	}

}
