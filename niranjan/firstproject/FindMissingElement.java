package com.niranjan.firstproject;

public class FindMissingElement {
	int findMissingEle(int[] arr) {
		int sum=0,l=arr.length+1;
		for(int i=0;i<arr.length;i++)
			sum=sum+arr[i];
		int totalsum = l*(l+1)/2;
		return totalsum-sum;
	}
	public static void main(String[] args) {
		int[] arr = {1,4,5,3};
		FindMissingElement obj = new FindMissingElement();
		System.out.println(obj.findMissingEle(arr));
	}
}