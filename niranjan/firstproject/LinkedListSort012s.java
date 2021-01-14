package com.niranjan.firstproject;

public class LinkedListSort012s {
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
		} System.out.println();}
	void sort() {
		int[] count = {0,0,0};
		Node cur = head;
		while(cur!=null) {
			count[cur.data]++;
			cur=cur.next;
		}
		cur=head;
		int i=0;
		
		while(cur!=null) {
			if(count[i]==0) 
				i++;
			else {
			cur.data=i;
			cur=cur.next;
			count[i]--;
			}
		}
	}

	public static void main(String[] args) {
		LinkedListSort012s li = new LinkedListSort012s();
		li.addNode(1);
		li.addNode(1);
		li.addNode(2);
		li.addNode(0);
		li.addNode(2);
		li.addNode(0);
		li.addNode(1);
		li.display();
		li.sort();
		li.display();
		
		

	}

}
