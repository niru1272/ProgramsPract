package com.niranjan.firstproject;

class StackOwn{	
	int Max = 5;
	int[] arr = new int[Max];
	int top;
	
	StackOwn(){
		top = -1;
	}
	
	boolean push(int x) {
		if(top>=(Max-1)) {
			System.out.println("stack overflowed");
			return false;
		} else { 
			arr[++top]=x;
			return true;
		}
	}
	
	int pop() {
		if(top<0) {
			System.out.println("no elements in stack");
			return 0;
		} else {
			int x = arr[top];
			arr[top--]=0;
			return x;
		}
	}
	
	void display() {
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
	}
}

public class StackArrayImplement {
	
	public static void main(String[] args) {
		StackOwn st = new StackOwn();
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(7);
		st.display();
		System.out.println(st.pop());
		st.display();
	}
}
