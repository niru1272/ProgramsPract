package com.niranjan.firstproject;

public class LinkedListImplementationSample2 {
	
	Node head;
	Node tail;
	public class Node{
		int data;
		Node next;
		Node(int d){
			data =d;
			next=null;
		}
	}
	
	public void addNode(int d) {
		Node temp = new Node(d);
		if(head==null) {
			head=temp;
			tail=temp;
		}
		else {
			tail.next=temp;
			tail=temp;
		}
	}
	
	public void display() {
		Node current=head;
		while(current!=null) {
			System.out.print(current.data+"->");
			current=current.next;
		}
		System.out.println();
	}
	public void findMid() {
		 Node slow = head;
		 Node fast = head;
		 while(fast.next!=null && fast!=null) {
			 slow=slow.next;
			 fast=fast.next.next;
		 }
		 System.out.println(slow.data);
	}

	public static void main(String[] args) {
		LinkedListImplementationSample2 ob = new LinkedListImplementationSample2();
		ob.addNode(2);
		ob.addNode(3);
		ob.addNode(4);
		ob.addNode(5);
		ob.addNode(6);
		ob.addNode(7);
		ob.display();
		ob.findMid();
	}
}
