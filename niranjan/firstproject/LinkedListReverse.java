package com.niranjan.firstproject;

public class LinkedListReverse {
	Node head;
	Node tail;
	public class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
		}
	}
	public void addNode(int d) {
		Node newNode = new Node(d);
		if(head==null) {
			head=newNode;
			tail = newNode;
		}
		else {
			tail.next=newNode;
			tail=newNode;
		}
	}
	public void display() {
		Node current=head;
		while(current!=null) {
			System.out.print(current.data+"->");
			current=current.next;
		} System.out.println();
	}
	public void reverse_iterative() {
		Node prev= null;
		Node current=head;
		Node next = head;
		while(current!=null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
	}
	
	public Node reverse_recursive() {
		if(head==null || head.next==null) 
			return head;
		head.next.next=head;
		return null;

	}
	
	public static void main(String[] args) {
		LinkedListReverse ob = new LinkedListReverse();
		for(int i=1;i<6;i++)
			ob.addNode(i);
		ob.display();
//		ob.reverse_iterative()	
		ob.reverse_recursive();
		ob.display();
	}

}
