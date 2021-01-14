package com.niranjan.driveprobs;

public class KthSmallestNumber2 {
	static void kthsmall(int[] arr,int k) {
		int key=arr[0],temp;
		for(int i=0;i<arr.length;i++) {
			if(key<arr[i]) {
				temp=arr[i];
				arr[i]=key;
				key=temp;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {7, 10, 4, 3, 20, 15};
		
		
	}
}
