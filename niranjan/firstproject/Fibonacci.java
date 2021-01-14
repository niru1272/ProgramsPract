package com.niranjan.firstproject;

public class Fibonacci {

	public static void printFibo(int n) {
		int x = 0, y = 1, z;
		System.out.print(x + " " + y + " ");
		while (n - 2 > 0) {
			z = x + y;
			System.out.print(z);
			System.out.print(" ");
			x = y;
			y = z;
			n = n - 1;
		}
	}

	public static void main(String[] args) {
		int n = 10;
		printFibo(n);

	}

}
