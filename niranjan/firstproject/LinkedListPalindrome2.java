package com.niranjan.firstproject;


public class LinkedListPalindrome2 {

	Node head,tail;
	
	public class Node{		int data;		Node next;		Node(int d){data=d;}		}
	
	public void addNode(int d) {
		Node newNode = new Node(d);
		if(head==null) {
			head=newNode;
			tail = newNode;}
		else {
			tail.next=newNode;
			tail=newNode;}}
	
	public void display() {			Node current=head;		while(current!=null) {		System.out.print(current.data+"->");		current=current.next;  		} System.out.println();}
	
	void reverseIt() {
		Node temp;
		Node prev=null;
		Node curr=head;
		while(true) {
			if(curr==null) {
				head=prev;
				break;
			}
			temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
		}	
	}
	
	public static void main(String[] args) {
		LinkedListPalindrome2 li = new LinkedListPalindrome2();
		for(int i=1;i<9;i++)
			li.addNode(i);
		li.display();
		li.reverseIt();
		li.display();
	}
}
