package com.niranjan.firstproject;

public class ReverseLinkedList {

	Node head;
	Node tail;

	class Node {
		int data;
		Node next;
		Node previous;

		Node(int d) {
			data = d;
		}
	}

	public void addNode(int d) {
		Node newNode = new Node(d);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void displayInReverse(Node current) {
		if (current != null) {
			displayInReverse(current.next);
			System.out.print(current.data + " ");
		}
	}

	public static void main(String[] args) {
		ReverseLinkedList lis = new ReverseLinkedList();
		lis.addNode(2);
		lis.addNode(5);
		lis.addNode(4);
		lis.addNode(9);
		lis.addNode(15);
		lis.displayInReverse(lis.head);
	}
}
