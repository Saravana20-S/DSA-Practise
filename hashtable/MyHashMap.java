package com.bridgelabz.hashtable;

public class MyHashMap<K, V> {
	
	private static final int SIZE = 10;
	
	private MyLinkedList<K,V>[] buckets;
	
	@SuppressWarnings("unchecked")
	public MyHashMap() {
		buckets = new MyLinkedList[SIZE];
		for(int i=0; i<SIZE; i++) {
			buckets[i] = new MyLinkedList<>();
		}
	}
	
// Hash Function
	private int hash(K key) {
		return Math.abs(key.hashCode()) % SIZE;
	}
	
	
// Insert
	public void put(K key, V value) {
		int index = hash(key);
		
		MyMapNode<K, V> node = buckets[index].search(key);
		
		if(node == null) {
			buckets[index].add(key, value);
		}else {
			node.setValue(value);
		}
	}
	

// Retrieve
	public V get(K key) {
		int index = hash(key);
		
		MyMapNode<K, V> node = buckets[index].search(key);
		if(node == null) return null;
		return node.getValue();
	}
	
// remove
	public boolean remove(K key) {
		int index = hash(key);
		return buckets[index].remove(key);
	}
	
	
// check the key exists or not
	public boolean containsKey(K key) {
		return  get(key) != null;
	}
	
// Display all the buckets
	public void display() {
		for(int i=0; i<buckets.length; i++) {
			System.out.println("Bucket "+i+": ");
			buckets[i].display();
		}
	}

}
