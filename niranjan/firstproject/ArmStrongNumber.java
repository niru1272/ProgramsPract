package com.niranjan.firstproject;

public class ArmStrongNumber {

	public static void verifyArmStrong(int n) { // 153
		int dig, sum = 0;

		while (n > 0) {
			dig = n % 10;
			n = n / 10;
			sum = sum + dig * dig * dig;

		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		int n = 153;
		verifyArmStrong(n);
	}

}
