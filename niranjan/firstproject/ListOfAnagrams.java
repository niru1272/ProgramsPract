package com.niranjan.firstproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ListOfAnagrams {
	
	
	public static void anagramCheck(String[] st) {
		Map<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
		
		for(int i=0;i<st.length;i++) {
			
			String real=st[i];
			char[] ch = real.toCharArray();
			Arrays.sort(ch);
			String sorted = new String(ch);
			if(map.containsKey(sorted)) {
				map.get(sorted).add(real);
			}
			else
			{
				ArrayList<String> li = new ArrayList<String>();
				li.add(real);
				map.put(sorted, li);
			}
		}
		for(Entry<String, ArrayList<String>>  entry: map.entrySet())
			System.out.print(entry.getValue()+" ");
		}
	

	public static void main(String[] args) {
		String[] arr = {"tac","act", "cat", "dog"};
		anagramCheck(arr);

	}

}
