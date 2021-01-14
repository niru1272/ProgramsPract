package com.niranjan.firstproject;


public class LinkedListAddTwoNumbers {
	Node head,tail;
	
	public class Node{		int data;		Node next;		Node(int d){data=d;}		}
	
	public void display() {			Node current=head;		while(current!=null) {		System.out.print(current.data+"->");		current=current.next;  		} System.out.println();}
	
	public void addNode(int d) {		Node newNode = new Node(d);		if(head==null) {			head=newNode;			tail = newNode;}		else {			tail.next=newNode;			tail=newNode;}}
	
	void addTwo(LinkedListAddTwoNumbers l1, LinkedListAddTwoNumbers l2) {
		LinkedListAddTwoNumbers l3=new LinkedListAddTwoNumbers();
		Node n1=l1.head;
		Node n2=l2.head;
		int ran,div=0,rem;
		while(n1!=null|| n2!=null) {
			ran=n1.data+n2.data+div;
			div=ran/10;
			if(div>0) {
				rem=ran%10;
				l3.addNode(rem);
			}
			else
				l3.addNode(ran);
			n1=n1.next;
			n2=n2.next;
		}
		l3.display();
	}
	
	public static void main(String[] args) {
		LinkedListAddTwoNumbers l1 = new LinkedListAddTwoNumbers();
		l1.addNode(2);
		l1.addNode(4);
		l1.addNode(3);
		l1.display();
		LinkedListAddTwoNumbers l2 = new LinkedListAddTwoNumbers();
		
		l2.addNode(5);
		l2.addNode(6);
		l2.addNode(4);
		l2.display();
		l1.addTwo(l1, l2);
		
		
		
	}

}
