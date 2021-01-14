package com.niranjan.firstproject;

public class LinkedListFindNthNodeFromLast {
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
		while(current.next!=null) {
			current=current.next;
			System.out.print(current.data+"->");
		} System.out.println();
	}
	public void findNthNodeFromEnd(int d) {
		Node mainpt=head;
		Node refpt=head;
		int count=0;
		while(count<d) {
			refpt=refpt.next;
			count++;
		}
		while(refpt!=null) {
			refpt=refpt.next;
			mainpt=mainpt.next;
		}
		System.out.println(mainpt.data);
	}
	public void deleteNthNodeFromEnd(int d) {
		Node mainpt=head;
		Node refpt=head;
		int count=0;
		while(count<d) {
			refpt=refpt.next;
			count++;
		}
		while(refpt!=null) {
			refpt=refpt.next;
			mainpt=mainpt.next;
		}
		mainpt.data=mainpt.next.data;
		mainpt.next=mainpt.next.next;
		
	}
	public static void main(String[] args) {
		LinkedListFindNthNodeFromLast ob = new LinkedListFindNthNodeFromLast();
		for(int i=1;i<7;i++)
			ob.addNode(i);
		ob.display();
		ob.findNthNodeFromEnd(2);
		ob.deleteNthNodeFromEnd(4);
		ob.display();
	}
}
