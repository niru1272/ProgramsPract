package com.niranjan.firstproject;

public class DeleteHeadNodeLinkedListExample {
	Node head;
	Node tail;

	class Node {
		int data;
		Node next;

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

	public void display() {
		Node current = head;
		if (head == null) {
			System.out.println("list is empty my son");
			return;
		}
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public void removeHeadNode() {
		if (head == null) {
			System.out.println("add something to list dear");
			return;
		}
		head = head.next;
	}

	public static void main(String[] args) {
		DeleteHeadNodeLinkedListExample li = new DeleteHeadNodeLinkedListExample();
		li.addNode(1);
		li.addNode(3);
		li.addNode(5);
		li.addNode(7);
		li.display();
		li.removeHeadNode();
		li.display();
		li.removeHeadNode();
		li.display();
		li.removeHeadNode();
		li.display();
		li.removeHeadNode();
		li.display();
	}

}
