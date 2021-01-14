package com.niranjan.firstproject;

import java.util.ArrayList;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
//		4,5,6,7
		List<Integer> li= new ArrayList<Integer>();
		int large=0,sec=0;
		li.add(7);
		li.add(5);
		li.add(6);
		li.add(4);
		
		for(int i=0;i<li.size();i++) {
			if(large<li.get(i)) {
				sec=large;
				large=li.get(i);
				}
			else if(sec<li.get(i)&&large>li.get(i)) {
				sec=li.get(i);
		}
		}
		System.out.println(sec);
		
		
	}

}
