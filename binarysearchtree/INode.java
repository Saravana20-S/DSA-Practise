package com.bridgelabz.binarysearchtree;

public interface INode<K>{
	
	K getKey();
	
	void setKey(K key);
	
	INode<K> getLeft();
	
	INode<K> getRight();
	
	void setLeft(INode<K> left);
	
	void setRight(INode<K> right);
	

}
