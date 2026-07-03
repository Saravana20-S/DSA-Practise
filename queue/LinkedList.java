package com.bridgelabz.queue;

import javax.management.RuntimeErrorException;

public class LinkedList {
	
	Node head;
	Node tail;
	
// 1. append
	public void append(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = tail = newNode;
			return;
		}
		
		tail.next = newNode;
		tail = newNode;
	}
	
//	2. deleteFirst
	public int deleteFirst() {
		
		if(head == null) {
			throw new RuntimeException("Queue is Empty");
		}
		
		int value = head.data;
		head = head.next;
		return value;
	}
	
//	3. peek
	public int peek() {
		if(head == null) {
			throw new RuntimeException("Queue is Empty");
		}
		return head.data;	
	}
	
//	4. isEmpty
	public boolean isEmpty() {
		return head == null;
	}
	
//	5. display
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data);
			
			if(temp.next != null) {
				System.out.print("->");
			}
			temp = temp.next;
		}
	}

}
