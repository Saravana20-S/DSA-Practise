package com.bridgelabz.stack;

public class Main {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		
		stack.push(70);
		stack.push(30);
		stack.push(56);
		
		
		stack.display();
		
		System.out.println();
		
		System.out.println("Top Element: "+stack.peek());
		
		System.out.println("Popping Elements: ");
		while(!stack.isEmpty()) {
			System.out.println("Popped: "+stack.pop());
		}
		
		stack.display();
	}
	
}
