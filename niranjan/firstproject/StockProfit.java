package com.niranjan.firstproject;

public class StockProfit {

	public static void main(String[] args) {
		
		//1,5,3,8,12
//		int[] ar = {1,15,3,8,2,5}; //13
		int[] ar = {100,180,260,310,40,535,695};
		int prf=0;
		
		for(int i=1;i<ar.length;i++) {
			if(ar[i]>ar[i-1])
				prf+=ar[i]-ar[i-1];
		}
		System.out.println(prf);
	}
	
	//1-2-3-4-5 key value reverse traverse
	//sell and buy once
	//break input
	
}
