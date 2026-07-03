package com.bridgelabz.stack;

import javax.management.RuntimeErrorException;

public class LinkedList {
	
	Node head;
	
	
//	1. Add
	public void add(int data) {
		Node newNode = new Node(data);
		
		newNode.next = head;
		head = newNode;
	}

	
// 2. IsEmpty
	public boolean isEmpty() {
		
		return head == null;
	}
	
	
//	3. Pop
	public int pop() {
		if(isEmpty()) throw new RuntimeException("Stack is Empty");
		int value = head.data;
		head = head.next;
		return value;
	}
	
// 4.peek
	public int peek() {
		if(isEmpty()) throw new RuntimeException("Stack is Empty");
		
		return head.data;
	}
	

// 5.display
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data);
			
			if(temp.next != null) System.out.print("->");
			temp = temp.next;
		}
	}
}
