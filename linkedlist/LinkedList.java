package com.bridgelabz.linkedlist;

import javax.naming.directory.SearchControls;



public class LinkedList {
	
	Node head;
	
	
//	1.Add at the end of the linked list
	public void add(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = newNode;
	}
	
	
//   2. Adding at the beginning	
//	public void add(int data) {
//		Node newNode = new Node(data);
//		newNode.next = head;
//		head = newNode;
//	}
	
	
	
//	3.Append method/Add
	public void append(int data) {
		
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node temp = head;
		if(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = newNode;
	}
	
//	3. Appending after the particular number	
	public void appendAfter(int previousData, int newData) {
		Node temp = head;
		
		if(temp != null && temp.data != previousData) {
			temp = temp.next;
		}
		
		if(temp == null) {
			System.out.println("No prevData: "+previousData);
			return;
		}
		
		Node newNode = new Node(newData);
		
		newNode.next = temp.next;
		temp.next = newNode;	
	}
	
	
//	4.Delete the first element
	public void pop(int data) {
		
		if(head == null) {
			System.out.println("No Element to delete");
			return;
		}
		head = head.next;
	}
	
	
//	5.Pop at the last
	public void popLast() {
		
		if(head == null) System.out.println("No Linked List");
		
		if(head.next == null) {
			head = null;
			return;
		}
		
		Node temp = head;
		while(temp.next.next != null) {
			temp = temp.next;
		}
		
		temp.next = null;
		
	}
	
//	6.Search the element
	public boolean searchKey(int key) {
		
		Node temp = head;
		while(temp != null) {
			
			if(temp.data == key) return true;
			
			temp = temp.next;
		}
		return false;
	}
	
	
//	7. Insert by Random
	public void addAfter(int key, int data) {
		Node temp = head;
		
		while(temp != null && temp.data != key) {
			temp = temp.next;
		}
		
		if(temp == null) {
			System.out.println("No insertion");
			return;
		}
		
		Node newNode = new Node(data);
		newNode.next = temp.next;
		temp.next = newNode;
		
	}
	
	
//	8. Remove element
	public void delete(int key) {
		if(head == null) return;
		if(head.data == key) {
			head = head.next;
			return;
		}
		
		Node temp = head;
		while(temp != null && temp.next.data != key) {
			temp = temp.next;
		}
		if(temp.next == null) {
			System.out.println("Node not found");
		}
		
		temp.next = temp.next.next;
	}
	
	
	
//	9.Size Method
	public int size() {
		int count =0;
		Node temp = head;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	
//	Display the linkedlist
	public void display() {
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data);
			
			if(temp.next != null) System.out.print("->");
			temp = temp.next;
		}
		System.out.println();
		
	}
	
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		

		System.out.println("Before, Linked List: ");
		list.display();
		System.out.println();
		
//		list.append(56);
//		list.append(70);
//		list.appendAfter(56, 30);
//		list.pop(56);
//		list.popLast();
//		list.addAfter(40, 45);
		
		list.delete(40);

		
		
		
		
		System.out.println("After, Linked List: ");
		list.display();
		System.out.println(list.size()	);
	
	}

}
