package com.niranjan.driveprobs;

public class ReverseArraay01 {
	
	static void reveseArray(int[] arr) {
		int n=arr.length;
		
		for(int i=0;i<n/2;i++) {
			int temp=arr[i];
			arr[i]=arr[n-1-i];
			arr[n-1-i]=temp;
		}
		
		
		for(int k=0;k<arr.length;k++)
			System.out.print(arr[k]+" ");
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		reveseArray(arr);
	}
}
