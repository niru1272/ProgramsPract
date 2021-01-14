package com.niranjan.firstproject;

public class LinkedListCircularCreate {
	
	
	Node head;
	Node tail;
	
	class Node{
		int data;
		Node next;
		
		Node (int d){
			data=d;
		}
	}
		
		public void addNode(int d) {
			Node newNode = new Node(d);
			if(head==null) {
				head=newNode;
				tail=newNode;
			}
			else {
				tail.next=newNode;
				tail=newNode;
				newNode.next=head;
			}
		}

}
