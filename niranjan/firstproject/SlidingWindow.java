package com.niranjan.firstproject;

public class SlidingWindow {
		int subArraySum(int arr[],int n, int k){
			
//			int first_window = 0;
//			for(int i=0; i<k ; i++){
//			first_window += arr[i];
//			}
//			int balance_window = first_window ; 
//			
//			for(int i=1;i<k+i&&i<n-k+1;i++) {
//				first_window+=  (arr[i+k-1]-arr[i-1]);
//				balance_window = Math.max(balance_window,first_window);
//			}
//			for(int i = k ; i<n ; i++ ){
//			first_window = first_window  + (arr[i]-arr[i-k]);
//			balance_window = Math.max(balance_window,first_window);
//			}
//			return balance_window;

		int max = 0;
		for (int j = 0; j < arr.length - k+1; j++) {
			 int sum = 0;
			for (int i = j,key=0; i < arr.length&&key<k; i++) {
				sum += arr[i];
				key++;
			}
			if (max < sum)
				max = sum;
		}
		return max;
	}

	public static void main(String[] args) {
		
		int[] arr = {100,200,300,400,500,600,700,800,1000,900};
		int k = 2;
		SlidingWindow ob = new SlidingWindow();
		System.out.println(ob.subArraySum(arr,arr.length, k));

	}

}
