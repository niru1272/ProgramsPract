package com.niranjan.firstproject;

public class FindUniqueNumber {
	
	void findUnique(int[] arr) {
		

		int l = arr.length;
		for (int i = 0; i < l; i++) {
			int count = 0;

			for (int j = 0; j < l; j++) {
				if (i != j)
					if (arr[i] == arr[j]) {
						count++;
						break;
					}
			}
			if (count == 0)
				System.out.println("unique no " + arr[i]);
		}
	}
	
	public static void main(String[] args) {
//		int[] arr= {1,5,6,1,6,5,9};
		int[] arr= {};
		FindUniqueNumber ob = new FindUniqueNumber();
		ob.findUnique(arr);
	}	
}
