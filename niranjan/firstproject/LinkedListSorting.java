package com.niranjan.firstproject;

import com.niranjan.firstproject.LinkedListSort012s.Node;

class LinkedListSorting
{
	Node head,tail;
	class Node{
		int data;
		Node next;
		Node(int d)
		{
			data=d;}		}
	
	public void addNode(int d) {
		Node newNode = new Node(d);
		if(head==null) {
			head=newNode;
			tail = newNode;}
		else {
			tail.next=newNode;
			tail=newNode;} }

	
	
    Node segregate()
    {
        if(head == null || head.next == null)
            return head;
        
        // Create three dummy nodes to point to 
        // beginning of three linked lists. These 
        // dummy nodes are created to avoid many 
        // null checks. 
        Node zeroD = new Node(0);
        Node oneD = new Node(0);
        Node twoD = new Node(0);
        
        // Initialize current pointers for three 
        // lists and whole list.
        Node zero = zeroD, one = oneD, two = twoD;
        Node curr = head;
        while(curr != null)
        {
            if(curr.data == 0)
            {
                zero.next = curr;
                zero = zero.next;
                curr = curr.next;
            }
            else if(curr.data == 1)
            {
                one.next = curr;
                one = one.next;
                curr = curr.next;
            }
            else
            {
                two.next = curr;
                two = two.next;
                curr = curr.next;
            }
        }
        // Attach three lists
        zero.next = (oneD.next  != null) ? (oneD.next) : (twoD.next);
        one.next = twoD.next;
        two.next = null;
        
        // updated head
        head = zeroD.next;
        return head;
    }
    public void display() {
		Node current=head;
		while(current!=null) {
			System.out.print(current.data+"->");
			current=current.next;
		} System.out.println();}
    
    public static void main(String[] args) {
    	LinkedListSorting ob = new LinkedListSorting();
    	ob.addNode(1);
    	ob.addNode(1);
    	ob.addNode(1);
    	ob.addNode(0);
    	ob.addNode(2);
    	ob.addNode(2);
    	ob.addNode(0);
    	ob.display();
    	ob.segregate();
    	ob.display();
    	
    	
    	
		
	}
}