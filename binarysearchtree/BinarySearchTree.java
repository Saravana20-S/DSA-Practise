package com.bridgelabz.binarysearchtree;

public class BinarySearchTree<K extends Comparable<K>>{
	private INode<K> root;
	
// Add
	public void add(K key) {
		root = addRecursive(root, key);
	}
	
// addRecursiveMethod
	public INode<K> addRecursive(INode<K> current, K key){
		if(current == null) {
			return new MyBinaryNode<>(key);
		}
		if(key.compareTo(current.getKey()) < 0) {
			current.setLeft(addRecursive(current.getLeft(), key));
		}else if(key.compareTo(current.getKey()) > 0) {
			current.setRight(addRecursive(current.getRight(), key));
		}
		return current;
	}
	
// inorder
	public void inorder() {
		inorder(root);
	}
	
// inorder Implemetation
	public void inorder(INode<K> node) {
		if(node == null) return;
		inorder(node.getLeft());
		System.out.println(node.getKey()+" ");
		inorder(node.getRight());
	}
	
// size
	public int size() {
		return size(root);
	}
	
// size implementation
	public int size(INode<K> node) {
		if(node == null) return 0;
		 return 1+size(node.getLeft()) + size(node.getRight());
	}
	
// search
	public boolean search(K key) {
		return search(root, key);
	}
	
// search implementation
	public boolean search(INode<K> current, K key) {
		
		if(current == null) {
			return false;
		}
		
		if(key.compareTo(current.getKey()) == 0) {
			return true;
		}
		
		if(key.compareTo(current.getKey())<0) {
			return search(current.getLeft(), key);
		}
		
		return search(current.getRight(), key);
	}
	
}
