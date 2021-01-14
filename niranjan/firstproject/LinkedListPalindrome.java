package com.niranjan.firstproject;

import java.util.Stack;

public class LinkedListPalindrome {
	
	Node head,tail;
	public class Node{
		char data;
		Node next;
		Node(char d){data=d;}		}
	public void addNode(char d) {
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
	
	void pushStack() {
		int key=0;
		 Stack<Character> stack = new Stack<>(); 
		 if(head==null) return;
		 Node curr= head;
		 while (curr!=null) { 
			 stack.push(curr.data);
			 curr=curr.next;
		 }
		 curr=head;
		 while(curr!=null) {
			 if(curr.data!=stack.pop()) {
				 key++;
				 break;
			 }
			 curr=curr.next;
		 }
		 if(key>0) System.out.println("not a palindrome");
		 else System.out.println("Palindrome");
	}
	public static void main(String[] args) {
		LinkedListPalindrome li = new LinkedListPalindrome();
		li.addNode('R');
		li.addNode('A');
		li.addNode('D');
		li.addNode('A');
		li.addNode('R');
		li.display();
		li.pushStack();
	}

}
