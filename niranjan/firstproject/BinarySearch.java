package com.niranjan.firstproject;

public class BinarySearch {
	
	int method(int[] arr,int beg, int end, int key) {
		int mid = (beg+end)/2;
		if(key==arr[mid])
			return mid;
		else if(key<arr[mid]) 
			return method(arr,0,mid-1,key);
		else if(key>arr[mid])
			return method(arr,mid+1,end,key);
		return -1;
		}

	public static void main(String[] args) {
		int[] arr=  { 2,3};
		int key = 1;
		BinarySearch ob = new BinarySearch();
		int res=ob.method(arr, 0, arr.length, key);
		if(res!=-1)
			System.out.println(res);
		else
			System.out.println("not found");
	}
}
