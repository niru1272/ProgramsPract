package com.niranjan.firstproject;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonUniqueLetter {
	
	void method(String str) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for(int i=0;i<str.length();i++) {
			if(!map.containsKey(str.charAt(i)))
				map.put(str.charAt(i), 1);
			else
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
		}
		System.out.println(map);
		for(Entry<Character, Integer> entry: map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
				break;
			}
		}
		
	}

	public static void main(String[] args) {

		String str = "tetottler";
		FirstNonUniqueLetter ob = new FirstNonUniqueLetter();
		ob.method(str);
		
	}
}
