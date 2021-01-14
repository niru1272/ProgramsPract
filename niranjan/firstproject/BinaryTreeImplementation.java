package com.niranjan.firstproject;

public class BinaryTreeImplementation {
	
	Node root;
	class Node{
		int data;
		Node left;
		Node right;
		Node(int d){
			data=d;
			left=right=null;
		}	
	Node addRecursive(Node current, int value) {
		if(current==null) 
			return new Node(value);
		if(value<current.data)
			addRecursive(current.left,value);
		else if(value>current.data)
			addRecursive(current.right,value);
		return current;
	}
	
	void insert(int value) {
		if(value<=data) {
			if(left==null)
				left=  new Node(value);
			else 
				left.insert(value);
		}
		else {
			if(right==null) {
				if(right==null)
					right = new Node(value);
				else
					right.insert(value);
			}
		}
	}
	
	public void printInOrder() {
		if(left!=null)
			left.printInOrder();
		System.out.println(data);
		if(right!=null)
			right.printInOrder();
		System.out.println(data);
	}
	
	boolean contains(int value) {
		if(value==data)
			return true;
		if(value<data) {
			if(left==null)
				return false;
			else
				return left.contains(value);
		}
		else {
			if(right==null)
				return false;
			return right.contains(value);
		}
		
	}
	
//	boolean findingElement(Node current, int value) {
//		if(value==current.data)
//			return true;
//		if(value<current.data)
//			return findingElement(current.left,value);
//		if(value>current.data)
//			return findingElement(current.right,value);
//	}
	
	
	void add(int d) {
		root=addRecursive(root,d);
	}
}

	public static void main(String[] args) {
		
//		BinaryTreeImplementation ob = new BinaryTreeImplementation();
		
//		ob.add(5);
//		ob.add(7);
//		ob.add(9);
	}

}
