package com.niranjan.firstproject;

import java.util.Stack;

public class StackBasicExample {

	public static void main(String[] args) {
		Stack<Integer> st= new Stack<>();
		st.push(2);
		st.push(8);
		st.push(9);
		st.push(10);
		st.pop();
		System.out.println(st);
		System.out.println(st.peek());
	}

}
