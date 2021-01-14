package com.niranjan.firstproject;

public class StackImplementation {
	
	Node head;
	class Node{
		int data;
		Node next;
		
		Node(int d){
			data =d;
		}
	}
	
	void push(int d) {
		Node current = new Node(d);
		if(head==null) {
			head=current;
			return;
		}
		current.next=head;
		head=current;
	}
	
	void pop() {
		if(head==null)
			return;
		head=head.next;
		
	}
	
	void display() {
		Node current = head;
		while(current!=null) {
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		StackImplementation ob = new StackImplementation();
		ob.push(2);
		ob.push(4);
		ob.push(6);
		ob.push(8);
		ob.display();
		ob.pop();
		ob.display();
		
	}

}
