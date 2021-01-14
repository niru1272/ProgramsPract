package com.niranjan.firstproject;

public class LinkedListRemoveDuplicates {
	
	Node head,tail;
	
	public class Node{		int data;		Node next;		Node(int d){data=d;}		}
	
	public void display() {			Node current=head;		while(current!=null) {		System.out.print(current.data+"->");		current=current.next;  		} System.out.println();}
	
	public void addNode(int d) {		Node newNode = new Node(d);		if(head==null) {			head=newNode;			tail = newNode;}		else {			tail.next=newNode;			tail=newNode;}}
	
	void removeDup() {
		Node temp=head;
		while(temp.next!=null) {
			if(temp.data==temp.next.data) 
				temp.next=temp.next.next;
			else
				temp=temp.next;
		}
	}

	public static void main(String[] args) {
		LinkedListRemoveDuplicates li = new LinkedListRemoveDuplicates();
		li.addNode(11);
		li.addNode(11);
		li.addNode(11);
		li.addNode(11);
		li.addNode(21);
		li.addNode(43);
		li.addNode(43);
		li.addNode(60);
		li.display();
		li.removeDup();
		li.display();
		
		
	}

}
