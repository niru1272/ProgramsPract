package com.niranjan.firstproject;

public class CountNodes {
	
	Node head;
	Node tail;
	
	class Node{
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
			tail=newNode;
		}
		else {
			tail.next=newNode;
			tail=newNode;
		}
		
	}
	
	public void getCount() {
		int count=0;
		Node current = head;
		if(head==null) {
			System.out.println("count is none");
			return;
		}
		while(current!=null)
		{
			current=current.next;
			count++;
		}
		System.out.println("number of nodes is "+count);
	}
	
	public static void main(String[] args) {
		CountNodes li = new CountNodes();
		li.addNode(2);
		li.addNode(5);
		li.addNode(4);
		li.addNode(9);
		li.getCount();
	}

}
