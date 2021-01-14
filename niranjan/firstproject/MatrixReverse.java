package com.niranjan.firstproject;

public class MatrixReverse {
	
	static void method(int[][] mat) {
		int row=mat.length;
		int col = mat[0].length;
		int key=0;
		
		for(int i=0;i<row;i++) 
			for(int j=i+1; j<col;j++){
//				if(i<j) {
					key=mat[i][j];
					mat[i][j]=mat[j][i];
					mat[j][i]=key;

		}
		for(int i=0;i<row;i++)
			for(int j=0 ; j<col;j++)
					System.out.print(mat[i][j]+ " ");
	}

	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		method(arr);

	}
}