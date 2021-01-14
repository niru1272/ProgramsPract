package com.niranjan.firstproject;

public class ArrayPrinting {
	
	
	static void printArray(int[][] mat) {
		int row=mat.length;
		int col = mat[0].length;
		
//		for(int i=0;i<row;i++)
//		{
//		if(i%2==0){
//		for(int j = 0 ; j<col;j++){
//		System.out.print(mat[i][j]+" ");
//		}
//		}
//		else{
//		for(int j = col-1;j>=0;j--){
//		System.out.print(mat[i][j]+" ");
//		}
//		}
//		}
//		
		
		
		
		for(int i=0,j=0;i<row&&j<col;) {
			if(i%2==0) {
				System.out.print(mat[i][j++]+" ");
			}
			else {
				System.out.print(mat[i][j--]+ " ");
				i++;
			}
			
		}
	}

	public static void main(String[] args) {
		
		int[][] arr= {{1,2,3,11},{4,5,6,12},{7,8,9,13}};
		printArray(arr);

	}

}
