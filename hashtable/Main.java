package com.bridgelabz.hashtable;

public class Main {
	public static void main(String[] args) {
		MyHashMap<String, Integer> map = new MyHashMap<String, Integer>();
		String paragraph = "Paranoids are not paranoid because they are paranoid "
                + "but because they keep putting themselves deliberately into "
                + "paranoid avoidable situations";
		String[] words = paragraph.toLowerCase().split(" ");

		for(String word : words) {
			Integer count = map.get(word);
			if(count == null) map.put(word, count);
			else map.put(word, count+1);
		
		}
		
		System.out.println("Before Removing: ");
		map.display();
		
		map.remove("avoidable");
		System.out.println();
		
		System.out.println("After Removing: ");
		map.display();
	}

}
