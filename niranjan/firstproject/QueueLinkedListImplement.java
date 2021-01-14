package com.niranjan.firstproject;

public class QueueLinkedListImplement {
	
	Node head;
	Node tail;
	
	class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
		}
	}
	
	public void push(int d) {
		Node newNode = new Node(d);
		if(head==null) {
			head=newNode;
			tail=newNode;
		} else {
			tail.next=newNode;
			tail=newNode;
		}
	}
	
	void pop() {
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
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
		QueueLinkedListImplement ob = new QueueLinkedListImplement();
		ob.push(9);
		ob.push(10);
		ob.push(11);
		ob.push(12);
		ob.push(13);
		ob.display();
		ob.pop();
		ob.display();
	}

}
