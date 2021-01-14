package com.niranjan.firstproject;

public class LInkedListDetectingLoop {
	
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
	public void loopDetecting() {
		Node fast=head, slow=head;
		int count=0;
		while(fast!=null&&fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
			if(fast==slow) {
				count++;
				break;}
		}
		if(count>0) System.out.println("loop detected");
		else System.out.println("no loop found");
	}
	
	public static void main(String[] args) {
		LInkedListDetectingLoop ob = new LInkedListDetectingLoop();
		for(int i=1;i<5;i++)
			ob.addNode(i);
		ob.display();
		ob.head.next.next.next=ob.head.next;
		ob.display();
		ob.loopDetecting();
	}

}
