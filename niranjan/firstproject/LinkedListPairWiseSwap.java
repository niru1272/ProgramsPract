package com.niranjan.firstproject;

public class LinkedListPairWiseSwap {
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
	
	void swapTwo() {

		Node p = head;
		Node q = head.next;
		Node d=new Node(0);
		Node temp;
		
		do{
			temp=q.next;
			d.next=q;
			q.next=p;
			p.next=temp;
			d=p;
			p=p.next;
			q=p.next;
		}while(q.next!=null);
	}

	public void display() {
		Node current=head;
		while(current!=null) {
			System.out.print(current.data+"->");
			current=current.next;
		} System.out.println();}

	public static void main(String[] args) {
		LinkedListPairWiseSwap li = new LinkedListPairWiseSwap();
		for(int i=1;i<11;i++)
			li.addNode(i);
		li.display();
		li.swapTwo();
		li.display();
	}

}
