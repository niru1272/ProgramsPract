package com.niranjan.firstproject;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {

	public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> temp = new ArrayList<List<Integer>>();
        
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                	List<Integer> li = new ArrayList<Integer>();
                    if(nums[i]+nums[j]+nums[k]==0){
                        li.add(nums[i]);
                        li.add(nums[j]);
                        li.add(nums[k]);
                        temp.add(li);
                    }
                }
            }
        }
        return temp;
    }

	public static void main(String[] args) {
		int[] arr = {-1,0,1,2,-1,-4};
		ThreeSum ob = new ThreeSum();
		System.out.println(ob.threeSum(arr));
	}
}
