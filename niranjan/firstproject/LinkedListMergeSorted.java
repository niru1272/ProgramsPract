package com.niranjan.firstproject;


public class LinkedListMergeSorted {
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
	public void mergedList() {
		
	}
	public static void main(String[] args) {
		LinkedListMergeSorted l1 = new LinkedListMergeSorted();
		LinkedListMergeSorted l2 = new LinkedListMergeSorted();
		l1.addNode(5);
		l1.addNode(10);
		l1.addNode(15);

		l2.addNode(2);
		l2.addNode(3);
		l2.addNode(20);
	}
}