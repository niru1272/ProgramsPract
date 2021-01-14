package com.niranjan.firstproject;

public class MinMaxOfSubArray {
	
	
	
	void minMaxSumSubArray(int[] arr, int k) {
		int sum=0;
		for(int j=0;j<arr.length-k+1;j++) {
			int min=0,max=0;
		for(int i=j;i<k+j;i++) {
			min=Math.min(min, arr[i]);
			max=Math.max(max,arr[i]);
		}
		sum+=min+max;
		}
//		for(int i=1;i<arr.length&&i<k+i;i++) {
//			if(min>Math.min(min, (arr[i+k-1])))
//				min=arr[i+k-1];
//		}
		
		System.out.println(sum);
//		System.out.println(max);
	}

	public static void main(String[] args) {
//        -1,5,1,4,2;		
		
		
		int arr[] = {2, 5, -1, 7, -3, -1, -2};
		int k=4;
		MinMaxOfSubArray ob  = new MinMaxOfSubArray();
		ob.minMaxSumSubArray(arr, k);
//		initiate variables min and max
//		calculate min and max for first sub array
//		iterate through array by comparing next index check the min and add it to sum
//		iterate through array by comparing next index check the max and add it to sum
		

	}

}
