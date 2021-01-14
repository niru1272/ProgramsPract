package com.niranjan.firstproject;


public class LinkedListMergeSort {
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
	void mergeSort() {
		
	}
	
	public static void main(String[] args) {
		LinkedListMergeSort li = new LinkedListMergeSort();
		li.addNode(10);
		li.addNode(5);
		li.addNode(2);
		li.addNode(23);
		li.addNode(45);
		li.addNode(21);
		li.addNode(7);
		li.display();
	}
	

}
