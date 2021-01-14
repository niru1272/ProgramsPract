package com.niranjan.firstproject;

public class WaterLevelCalculation {
	
	void calculateWaterLevel(int[] arr) {
		int key=0;
		
		for(int i=0;i<arr.length;i++) {
			key += returnMin(rightMax(arr,i),leftMax(arr,i))-arr[i];
		}
		System.out.println("output "+key);
	}
	
	int rightMax(int[] arr, int index) {
		int def=arr[index];
		for(int i=index;i<arr.length;i++) 
			if(arr[i]>def) 
				def=arr[i];
			
		return def;
	}
	
	
	
	
	int leftMax(int[] arr, int index) {
		int def=arr[index];
		for(int i=index;i>=0;i--) {
			if(def<arr[i])
				def=arr[i];
		}
		return def;
	}
	
	int returnMin(int lm, int rm) {
		if(lm>rm)
			return rm;
		return lm;
	}
	
	
	int totalWater(int arr[],int n){
		int total_water  = 0 ;
		int [] leftmax = new int[n];
		int [] rightmax = new int[n];
		leftmax[0] = arr[0];
		for(int i =1 ;i<n ; i++){
			leftmax[i] = Math.max(arr[i],leftmax[i-1]);
		}
		rightmax[n-1] = arr[n-1];
		for(int i =n-2 ;i>=0 ; i--){
			rightmax[i] = Math.max(arr[i],rightmax[i+1]);
		}
		for(int i=1 ; i<n-1; i++){
			total_water += Math.min(leftmax[i],rightmax[i])-arr[i];
		}
		return total_water;
		}

	public static void main(String[] args) {
		
		int[] arr = {3,0,1,2,5,0};
		WaterLevelCalculation ob = new WaterLevelCalculation();
//		ob.calculateWaterLevel(arr);
		System.out.println(ob.totalWater(arr,arr.length));

	}

}
