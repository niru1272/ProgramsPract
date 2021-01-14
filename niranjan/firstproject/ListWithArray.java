package com.niranjan.firstproject;

import java.util.ArrayList;
import java.util.List;

public class ListWithArray {
	
	void solution(int[] heights) {
		
		List<int[]> list = new ArrayList<>();
		for(int i=0;i<heights.length;i++) {
			 list.add(new int[]{i, heights[i]});
		}
		
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		ListWithArray ob = new ListWithArray();
		ob.solution(arr);

		
	}

}
