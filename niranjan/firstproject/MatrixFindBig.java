package com.niranjan.firstproject;

public class MatrixFindBig {
	
	static boolean method(int[][] mat) {
		int row=mat.length;
		int col = mat[0].length;
		int key=29,i=0;
		int pointer=col-1;
		for(int j=pointer;j>=0;j--) {
			if(mat[0][j]<=key) {
				if(key==mat[0][j])
					return true;
				for(i=0;i<row;i++) {
					if(mat[i][j]==key)
						return true;
				}
			}
		}
	
//		for(int i=0;i<row;i++) {
//			for(int j=0; j<col;j++){
//				if(i==j&&mat[i][j]>key) {
//					k=i;
//					break;
//				}
//				
//			}
//		}
//		for(int i=k-1;i<row;i++) 
//			for(int j=k-1; j<col;j++)
//				if(mat[i][j]==key)
//					return true;
		
		return false;
	}

	public static void main(String[] args) {
		int[][] arr = { {10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48},{32, 33, 39, 50}};
		System.out.println(method(arr));
	}

}
