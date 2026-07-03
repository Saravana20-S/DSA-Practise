package com.bridgelabz.sortedlinkedlist;

public class Node<T extends Comparable<T>> {
	T data;
	Node next;
	
	Node(T data){
		this.data = data;
		this.next = null;
	}
}
