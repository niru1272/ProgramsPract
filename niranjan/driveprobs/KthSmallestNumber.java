package com.niranjan.driveprobs;

import java.util.Arrays;

public class KthSmallestNumber {
	static void kthsmall(int[] arr, int k) {
		Arrays.sort(arr);
		System.out.println(k+"th smallest number is "+ arr[k-1]);
	}

	public static void main(String[] args) {
	
		int[] arr = {7, 10, 4, 3, 20, 15};
		kthsmall(arr,3);
		int[] ar2 = {7, 10, 4, 20, 15};
		kthsmall(ar2,4);
	}
}
