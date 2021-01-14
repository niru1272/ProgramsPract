package com.niranjan.firstproject;

public class QueueImplementation {
	Node front,rear;
		class Node{
			int data;
			Node next;
			
			Node(int d){
				data=d;
			}
		}
		
		void push(int d) {
			Node current = new Node(d);
			if(front==null) {
				front=current;
				rear = current;
				return;
			}
			rear.next=current;
			rear=current;
		}
		
		void pop() {
			if(front==null) {
				return;
			}
			front=front.next;
		}
		void display() {
			Node temp=front;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
		
		public static void main(String[] args) {
			QueueImplementation ob = new QueueImplementation();
			ob.push(3);
			ob.push(4);
			ob.push(5);
			ob.push(10);
			ob.display();
			ob.pop();
			ob.pop();
			ob.display();
		}

	

}
