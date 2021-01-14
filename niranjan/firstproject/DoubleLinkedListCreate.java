package com.niranjan.firstproject;

public class DoubleLinkedListCreate {

	Node head, tail;

	class Node {
		int data;
		Node next;
		Node prev;

		Node(int d) {
			data = d;
		}
	}

	public void addNode(int d) {

		Node temp;
		Node newNode = new Node(d);
		if (head == null)
			head = tail = newNode;
		else {
			temp = tail;
			tail.next = newNode;
			tail = newNode;
			tail.prev = temp;
		}
	}

	public void displayInReverse() {

		Node current = tail;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.prev;
		}
		System.out.println();
	}

	public void display() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		DoubleLinkedListCreate ob = new DoubleLinkedListCreate();
		ob.addNode(2);
		ob.addNode(4);
		ob.addNode(9);
		ob.addNode(90);
		ob.displayInReverse();
		ob.display();
	}
}
