package com.niranjan.firstproject;

import java.util.Map;

public class IntegerToRoman {

	public static int returnInt(String s) {
		Map<Character, Integer> map = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (i == 0)
				sum += map.get(s.charAt(i));
			else if (map.get(s.charAt(i)) <= map.get(s.charAt(i - 1)))
				sum += map.get(s.charAt(i));
			else
				sum += map.get(s.charAt(i)) - 2 * map.get(s.charAt(i - 1));
		}
		return sum;
	}

	public static void main(String[] args) {
		String str = "MCMXCIV";
		System.out.println(returnInt(str));

	}

}
