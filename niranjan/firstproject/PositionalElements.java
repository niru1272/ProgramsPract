package com.niranjan.firstproject;

public class PositionalElements {
	
	static void method(int[][] ar) {
		int count=0;
		int row=ar.length;
		int col=ar[0].length;
		int temp[] = new int[4];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				temp= returnMinMax(ar,i,j);
				if(ar[i][j]==temp[0]||ar[i][j]==temp[2]) 
					count=count+1;
				else if(ar[i][j]==temp[1]||ar[i][j]==temp[3])
					count=count+1;
			}
		}
		System.out.println(count);
	}
	
	static int[] returnMinMax(int[][] ar, int row, int col) {
		int samp[] = new int[4];
		int mincol=ar[row][col];
		int maxcol=ar[row][col];
		int minrow=ar[row][col];
		int maxrow=ar[row][col];
		for(int i=0;i<ar.length;i++) {
			if(mincol>ar[i][col])
				mincol=ar[i][col];
			if(maxcol<ar[i][col])
				maxcol=ar[i][col];
		}
		for(int j=0;j<ar[0].length;j++) {
			if(minrow>ar[row][j])
				minrow=ar[row][j];
			if(maxrow<ar[row][j])
				maxrow=ar[row][j];
		}
		samp[0]=mincol;
		samp[1]=maxcol;
		samp[2]=minrow;
		samp[3]=maxrow;
		return samp;
	}

	public static void main(String[] args) {
		int[][] arr = {{1,3,4},{5,2,9},{8,7,6}};
		method(arr);
	}
}
