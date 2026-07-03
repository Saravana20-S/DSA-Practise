package com.bridgelabz.queue;

public class Main {

	public static void main(String[] args) {
		Queue queue = new Queue();
		
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);
		
		System.out.println("Queue: ");
		queue.display();
		
		System.out.println();
		
		System.out.println("Front Element: "+queue.peek());
	
		while(!queue.isEmpty()) {
			System.out.println("Dequeue Elements: "+queue.dequeue());
			
		}
		
		System.out.println("After popped: ");
		queue.display();
		
	}
}
