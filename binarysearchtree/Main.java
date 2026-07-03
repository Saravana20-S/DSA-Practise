package com.bridgelabz.binarysearchtree;

public class Main {
	public static void main(String[] args) {
		BinarySearchTree<Integer> bst = new BinarySearchTree<>();
		bst.add(56);
		bst.add(30);
		bst.add(70);
		bst.add(22);
		bst.add(40);
		bst.add(60);
		bst.add(95);
		bst.add(11);
		bst.add(65);
		bst.add(3);
		bst.add(16);
		bst.add(63);
		bst.add(67);
		
		int key = 63;

		System.out.println("Inorder Traversal: ");
		bst.inorder();
		
		System.out.println("Size of the node is: "+bst.size());
		System.out.println();
		
		if(bst.search(key)) {
			System.out.println(key +" Key found");
		}else {
			System.out.println("Key not found");
		}
		
	}

}
