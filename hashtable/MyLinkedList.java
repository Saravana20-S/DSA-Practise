package com.bridgelabz.hashtable;

public class MyLinkedList<K, V> {
	
	private MyMapNode<K, V> head;
	
// Add a new Node
	public void add(K key, V value) {
		
		MyMapNode<K, V> newNode = new MyMapNode<K, V>(key, value);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		MyMapNode<K, V> temp = head;
		while(temp.getNext() != null) {
			temp = temp.getNext();
		}
		
		temp.setNext(newNode);
	}
	
	
// Search node by key
	public MyMapNode<K, V> search(K key){
		MyMapNode<K, V> temp = head;
		
		while(temp != null) {
			if(temp.getKey().equals(key)) {
				return temp;
			}
			
			temp = temp.getNext();
		}
		return null;
	}
	
	
// remove function
	public boolean remove(K key) {
		
		if(head == null) return false;
		
		// remove first node
		if(head.getKey().equals(key)) {
			head = head.getNext();
			return true;
		}
		MyMapNode<K, V> current = head;
		MyMapNode<K, V> previous = null;
		
		while(current != null) {
			if(current.getKey().equals(key)) {
				previous.setNext(current.getNext());
				return true;
			}
			previous = current;
			current = current.getNext();
		}
		
		return false;
	}
	
	
	
// display
	public void display() {
		MyMapNode<K, V> temp = head;
		  if (temp == null) {
		        System.out.println("Empty");
		        return;
		    }
		
		while(temp != null) {
			System.out.print(temp +"->");
			temp = temp.getNext();
		}
		
		System.out.println("null");
	}

}
