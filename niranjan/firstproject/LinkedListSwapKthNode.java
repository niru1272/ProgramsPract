package com.niranjan.firstproject;

public class LinkedListSwapKthNode {
	Node head,tail;
	int size;
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
			tail=newNode;} size++;}
	
	public void display() {
		Node current=head;
		while(current!=null) {
			System.out.print(current.data+"->");
			current=current.next;
		} System.out.println("size of LL "+size);}
	
	void swapKthElement(int k) {
		Node x=head;
		Node x_prev=null;
		for(int i=1;i<k;i++) {
			x_prev = x;
			x = x.next;
		}
		
		Node y=head;
		Node y_prev=null;
		for(int i=1;i<size-k+1;i++) {
			y_prev =y;
			y=y.next;
		}
		
		System.out.println(x_prev.data);
		System.out.println(x.data);
		System.out.println(y_prev.data);
		System.out.println(y.data);
		
		x_prev.next=y;
		y_prev.next=x;
		
		Node temp=y.next;
		y.next=x.next;
		x.next=temp;
		
		
		
		
		
		
//	
//		x_prev.next=y;
//		y_prev.next=x;
//		
//		Node temp=x.next;
//		x.next=y.next;
//		
//		
//		y.next=temp;
//		
	
	
		
		
		
//		int count=1;
//		Node firstK=head,curr = head,lastK=head;
//		while(curr!=null) {
//			if(count==k)
//				firstK=curr;
//			if(count==size-k+1)
//				lastK=curr;
//			curr=curr.next;
//			count++;
//		}
//		int temp=lastK.data;
//		lastK.data=firstK.data;
//		firstK.data=temp;
	}

	public static void main(String[] args) {		
		LinkedListSwapKthNode li = new LinkedListSwapKthNode();
		for(int i=1;i<7;i++)
			li.addNode(i);
		li.display();
		li.swapKthElement(2);
		li.display();
	}
}
