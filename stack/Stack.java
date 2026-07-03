package com.bridgelabz.stack;

public class Stack {
	
	 LinkedList list = new LinkedList();
	 
	 public void push(int data) {
		 list.add(data);
	 }
	 
	 public int pop() {
		 return list.pop();
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
