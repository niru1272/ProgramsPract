package com.niranjan.firstproject;

public class LinkedListDeleteMidNode {
	Node head;
	Node tail;
	int size=0;	
	class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
		}
	}
	
	public void addNode(int d) {
		Node newNode = new Node(d);
		
		
		if (head==null) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next=newNode;
			tail=newNode;
		}
		size++;
	}
	
	public void deleteMid() {
		Node current=head;
		Node temp=head;
		int midcount=size/2;
		int count=0;
		while(current!=null) {
			if(count==midcount-1) {
				current.next=current.next.next;
				current=temp.next;
				size--;
				break;
			}
			current=current.next;
			temp=current;
			count++;
		}
		
	}
	
	public void display() {
		Node current=head;
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		while(current!=null) {
			System.out.print(current.data+ " ");
			current=current.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		LinkedListDeleteMidNode ob= new LinkedListDeleteMidNode();
		ob.display();
		ob.addNode(3);
		ob.addNode(5);
		ob.addNode(7);
		ob.addNode(9);
		ob.addNode(11);
		ob.addNode(13);
		ob.addNode(17);
		ob.addNode(19);
		ob.display();
		ob.deleteMid();
		ob.display();
		ob.deleteMid();
		ob.display();
		ob.deleteMid();
		ob.display();
		ob.deleteMid();
		ob.display();
		ob.deleteMid();
		ob.display();
		ob.deleteMid();
		ob.display();
		ob.deleteMid();
		ob.display();
	}
}
