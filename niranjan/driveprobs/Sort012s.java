package com.niranjan.driveprobs;

public class Sort012s {
	
	public static void main(String[] args) {
		int[] arr= {0,2,1,2,0};
		int len=arr.length-1,temp;
		for(int i=0;i<len;i++) {
			if(arr[i]==0) {
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
			else if(arr[i]==2) {
				temp=arr[len-1];
				arr[len-1]=arr[len-1-i];
				arr[len-1-i]=temp;
			}
		}
		for(int i=0;i<len;i++)
			System.out.print(arr[i]+" ");
	}
}
