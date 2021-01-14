package com.niranjan.firstproject;

public class StackLinkedListImplement {
	
	Node head;
	class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
		}
	}

	void push(int d) {
		Node newNode = new Node(d);
		if(head==null) { 
			head=newNode;
		}
		else {
			Node temp= head;
			head=newNode;
			head.next=temp;
		}
	}
	
	int pop() {
		if(head==null) {
			System.out.println("stack is empty");
			return 0;
		}
		else {
			Node temp = head;
			head=head.next;
			return temp.data;
		}
	}
	 void display() {
		 Node current = head;
		 if(head==null) {
			 System.out.println("Stack is empty");
			 return;
		 }
		 while(current!=null) {
			 System.out.print(current.data+" ");
			 current=current.next;
		 }
		 System.out.println();
	 }
	 
	 int peek() {
		 return head.data;
	 }
	 
	 public static void main(String[] args) {
		 StackLinkedListImplement ob = new StackLinkedListImplement();
		 ob.push(3);
		 ob.push(4);
		 System.out.println("peek value "+ob.peek());
		 ob.push(5);
		 ob.push(6);		 
		 ob.display();
		 System.out.println(ob.peek());
		 System.out.println("removed item: "+ob.pop());
		 ob.display();
		 System.out.println(ob.pop());
	}
	
}



