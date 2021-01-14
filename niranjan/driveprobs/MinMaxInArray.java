package com.niranjan.driveprobs;

public class MinMaxInArray {
	static void minMax(int[] ar)
	{
		int min=ar[0],max=ar[0];
		for(int i=0;i<ar.length;i++) {
			if(min>ar[i])
				min=ar[i];
			if(max<ar[i])
				max=ar[i];
		}
		System.out.println("min: "+min + " max: "+max);
	}
	public static void main(String[] args) {
		int[] arr= {1000, 11, 445, 1, 330, 3000};
		minMax(arr);
	}
}
