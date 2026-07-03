package com.bridgelabz.queue;

public class Queue {

	LinkedList list = new LinkedList();
	
	public void enqueue(int data) {
		list.append(data);
	}
	
	public int dequeue() {
		return list.deleteFirst();
	}
	
	public int peek() {
		return list.peek();
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public void display() {
		list.display();
	}
}
