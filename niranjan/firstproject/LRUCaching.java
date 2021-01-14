package com.niranjan.firstproject;

public class LRUCaching {
	
	static int[] count= new int[3];
	boolean isPresentInArray(int[] arr, int key) {
		for(int i=0;i<arr.length;i++) 
			if(key==arr[i])
				return true;
		return false;
	}
	
	static void insertToArray(int[] arr,int value) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				arr[i]=value;
				break;
			}
		}
	}

	public static void main(String[] args) {
		LRUCaching ob = new LRUCaching();
		int[] arr= {1, 2, 3, 4, 1, 2, 5, 1, 2, 3, 4, 5};
		
		
		
		for(int i=0;i<arr.length;i++) {
			if(!ob.isPresentInArray(count, arr[i]))
			{
				insertToArray(count,arr[i]);
			}
		}
		
	}
}
