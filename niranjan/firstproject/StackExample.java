package com.niranjan.firstproject;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int key=0;
		Stack<Integer> stack = new Stack<Integer>(); 
		for(int i=1;i<9;i++)
			stack.push(i);
		for(int i=1;i<9;i++) {
			key = stack.pop();
			System.out.print(key+" ");
		}
			

	}

}
