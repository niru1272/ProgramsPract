package com.niranjan.firstproject;

public class LinkedListMidElement {
	
	
	Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
		}
	}
	
	void addNode(int d) {
		Node nn = new Node(d);
		
		if(head==null) {
			head=nn;
			return;
		}
		Node current=null;
		while(current==null) {
			current=current.next;
		}
		current.next=nn;
		
	}
	
	
	Node findMidPointer() {
		Node fast=head,slow=head;
		while(fast!=null&& fast.next != null) {
			
			fast=fast.next.next;
			slow=slow.next;		
		}
		return slow;
	}
	
	void findMid() {
		Node current=head;
		int size=0;
		if(head==null)
			return;
		while(current!=null) {
			size++;
			current=current.next;
		}
		int mid=0;
		if(size%2==0)
			mid=size/2+1;
		else mid=size/2;
		current=head;
		size=0;
		while(current!=null) {
			if(size==mid) {
				System.out.println(current.data);
				break;
			}
			size++;	
			current=current.next;
		}
	}

	public static void main(String[] args) {
		LinkedListMidElement li = new LinkedListMidElement();
		for(int i=0;i<5;i++)
			li.addNode(i);
		li.findMid();

	}

}
