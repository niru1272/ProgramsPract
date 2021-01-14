package com.niranjan.firstproject;
public class LinkedListDisplayNodes {
	
	 Node head;
	static class Node{
		int data;
		Node next;
		Node (int d){
			data=d;
		}
	}

	public void display() {
		Node n = head;
		while (n!=null) {
			System.out.println(n.data);
			n=n.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedListDisplayNodes li = new LinkedListDisplayNodes();
		li.head = new Node(100);
		 Node second = new Node(200);
		 Node third = new Node(300);
		 
		 li.head.next=second;
		 second.next=third;
		 li.display();
	}
}
