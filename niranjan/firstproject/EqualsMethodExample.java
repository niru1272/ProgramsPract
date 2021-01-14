package com.niranjan.firstproject;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class EqualsMethodExample {
	int i=10;
	void method() {
		i=20;
//		System.out.println(i);
	}
	void method2() {
//		System.out.println(i);
	}
	public static void main(String[] args) {
		EqualsMethodExample obj = new EqualsMethodExample();
		System.out.println(obj.hashCode());
//		obj.method();
		EqualsMethodExample obj2 = new EqualsMethodExample();
//		System.out.println(obj2.hashCode());
		obj2.method2();
		obj=obj2;
		obj2.method2();
//		System.out.println(obj2.equals(obj));
//		System.out.println(obj.hashCode());
//		System.out.println(obj2.hashCode());
		
		Map<Integer,Integer> ob = new HashMap<Integer,Integer>();
		Map<Integer,Integer> oj = new LinkedHashMap<Integer,Integer>();
		ob.put(1,11);
		oj=ob;
		System.out.println(oj);
		System.out.println(ob);
	}
}