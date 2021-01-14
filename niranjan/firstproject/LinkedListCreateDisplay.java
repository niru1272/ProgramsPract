package com.niranjan.firstproject;

public class LinkedListCreateDisplay {
	
	 class Node{
		int data;
		Node next;
		
		Node (int d){
			data =d;
		}
	 }
	public Node head;
	public Node tail;
		
		public void addNode(int d) {
			Node nn = new Node(d);
			if(head==null) {
				head=nn;
				tail=nn;
			}
			else {
				tail.next=nn;
				tail=nn;
			}
		}
		
		public void display() {
			Node current=head;
			if(head==null) {
				System.out.println("list is empty");
				return;
			}
			while(current!=null) {
				System.out.println(current.data);
				current=current.next;
			}
		}
		
		public static void main(String[] args) {
			LinkedListCreateDisplay li = new LinkedListCreateDisplay();
			li.addNode(3);
			li.addNode(5);
			li.addNode(9);
			li.display();
		}
}
