package com.niranjan.firstproject;

public class LinkedLIstStartOfLoop {
	
	Node head,tail;
	public class Node{
		int data;
		Node next;
		Node(int d){data=d;}		}
	public void addNode(int d) {
		Node newNode = new Node(d);
		if(head==null) {
			head=newNode;
			tail = newNode;}
		else {
			tail.next=newNode;
			tail=newNode;}}
	public void display() {
		Node current=head;
		while(current!=null) {
			System.out.print(current.data+"->");
			current=current.next;
		} System.out.println();}
	public void findLoopNode() {
		Node slow=head,fast=head;
		while(fast!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast){
				System.out.println("found loop ");
				break;
			}
		}
		slow=head;
		Node temp=null;
		int count=1;
		while(slow!=fast) {
			slow=slow.next;
			temp=fast;
			fast=fast.next;
			System.out.println();
		}
		System.out.println("loop is at node "+fast.data);
		fast=fast.next;
		while(slow!=fast) {
			fast=fast.next;
			count++;
		}
		System.out.println("size of loop is "+count);
		temp.next=null;
	}
	
	public static void main(String[] args) {
		LinkedLIstStartOfLoop ob = new LinkedLIstStartOfLoop();		
		ob.addNode(0);
		ob.addNode(1);
		ob.addNode(2);
		ob.addNode(3);
		ob.addNode(4);
		ob.addNode(5);
		ob.display();
		ob.head.next.next.next.next.next.next=ob.head.next.next;
//		ob.display();
		ob.findLoopNode();
		ob.display();
	}

}
