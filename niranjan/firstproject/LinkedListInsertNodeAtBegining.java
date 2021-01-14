package com.niranjan.firstproject;

public class LinkedListInsertNodeAtBegining {
	
	Node head;
	Node tail;
	
	class Node{
		int data;
		Node next;
		
		Node (int d){
			data=d;
		}
	}
		
		public void addNode(int d) {
			Node newNode = new Node(d);
			if(head==null) {
				head=newNode;
				tail=newNode;
			}
			else {
				tail.next=newNode;
				tail=newNode;
			}
		}
		
		public void addNodeAtBegining(int d) {
			Node newNode = new Node(d);
			Node temp;
			if(head==null) {
				head=newNode;
				tail=newNode;
			}
			temp=head;
			head=newNode;
			head.next=temp;
		}
		
		public void display() {
			Node current=head;
			if(head==null)
				return;
			while(current!=null) {
				System.out.print(current.data+" ");
				current=current.next;
			}
			System.out.println();
		}
	
	

	public static void main(String[] args) {
		LinkedListInsertNodeAtBegining ob = new LinkedListInsertNodeAtBegining();
//		ob.addNode(1);
//		ob.addNode(2);
//		ob.addNode(4);
//		ob.addNode(6);
//		ob.addNode(8);
//		ob.display();
//		ob.addNodeAtBegining(9);s
//		ob.addNodeAtBegining(89);
//		ob.display();
		
		ob.display();
		ob.addNode(4);
		ob.display();
		

	}

}
