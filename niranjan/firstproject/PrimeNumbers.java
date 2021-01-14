package com.niranjan.firstproject;

public class PrimeNumbers {

	public static void printPrime(int key) {
		for (int n = 2; n < key; n++) {
			int k = 0;
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					k = k + 1;
					break;
				}
			}
			if (k == 0)
				System.out.print(n + " ");
		}
	}

	public static void main(String[] args) {
		int n = 35;
		printPrime(n);
	}

}
