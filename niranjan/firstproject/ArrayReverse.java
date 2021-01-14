package com.niranjan.firstproject;

public class ArrayReverse {
	static void reverse(int[] arr) {
		int[] temp = new int[arr.length];
		for(int i=0;i<arr.length;i++)
			temp[arr.length-1-i]=arr[i];
		for(int i=0;i<arr.length;i++)
			System.out.print(" "+temp[i]);
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		reverse(arr);

	}

}
