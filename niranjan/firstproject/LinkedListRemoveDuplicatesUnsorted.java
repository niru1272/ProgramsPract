package com.niranjan.firstproject;

import java.util.ArrayList;
import java.util.List;

public class LinkedListRemoveDuplicatesUnsorted {
	
	Node head,tail;
	
	public class Node{		int data;		Node next;		Node(int d){data=d;}		}
	
	public void display() {			Node current=head;		while(current!=null) {		System.out.print(current.data+"->");		current=current.next;  		} System.out.println();}
	
	public void addNode(int d) {		Node newNode = new Node(d);		if(head==null) {			head=newNode;			tail = newNode;}		else {			tail.next=newNode;			tail=newNode;}}
	
	public void removeDupl() {
		List<Integer> list = new ArrayList<Integer>();
		Node prev=head;
		Node cur=head;
		while(cur!=null) {
			if(!list.contains(cur.data)) {
				list.add(cur.data);
				prev=cur;
				cur=cur.next;
			}
			else {
				if(cur.next==null) {
					prev.next=null;
					break;	
				}
				prev.next=cur.next;
				cur=cur.next;
			}
		}
		}

	public static void main(String[] args) {
		LinkedListRemoveDuplicatesUnsorted li = new LinkedListRemoveDuplicatesUnsorted();
		li.addNode(12);
		li.addNode(11);
		li.addNode(12);
		li.addNode(21);
		li.addNode(41);
		li.addNode(43);
		li.addNode(21);
		li.display();
		li.removeDupl();
		li.display();
		
		
	}

}
