package com.niranjan.firstproject;

 class LinkedListIntersectionPoint {
	
	Node head1,head2;
	
	static class Node{
		int data;
		Node next;
		Node(int d){data=d;}		}
	void getCommonNode() {
		long before = System.currentTimeMillis();
		Node current=head1;
		while(current!=null) {
			
			Node current2 = head2;
			while(current2!=null) {
				
				if(current.data==current2.data) {
					System.out.println("the matching node is "+current.data);
					break;
				}
				current2=current2.next;
			}
			current=current.next;
		}
		 long after = System.currentTimeMillis();
		 System.out.println("execution time is "+(after-before));
	}
	 
	 

	public static void main(String[] args) {

		LinkedListIntersectionPoint list = new LinkedListIntersectionPoint();				
		list.head1=new Node(3);
        list.head1.next = new Node(6); 
        list.head1.next.next = new Node(9); 
        list.head1.next.next.next = new Node(15); 
        list.head1.next.next.next.next = new Node(30); 
        
        list.head2 = new Node(10); 
        list.head2.next = new Node(15); 
        list.head2.next.next = new Node(30); 
        list.getCommonNode();

	}

}
