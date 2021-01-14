package com.niranjan.firstproject;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class StringBurstLength {

	public static void main(String[] args) {
		List<List<Integer>> temp = new ArrayList<List<Integer>>();
		ArrayList<Integer> li = new ArrayList<Integer>();
		temp.add(li);
		String str= "abbcccdeaffff";
		int key=3;
		String st="";
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++) {	
			if(!map.containsKey(str.charAt(i)))
				map.put(str.charAt(i), 1);
			else
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			
		}
		for(int i=0;i<str.length();i++) {
			if(map.get(str.charAt(i))<key) {
				st+=str.charAt(i);
			}
		}
		System.out.println(st);
	}
}