package com.bridgelabz.linkedlist;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

	@Test
	public void get30_True() {
		
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		
		assertTrue(list.searchKey(30));
	}
	
	@Test
	public void get100_False() {
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		
		assertTrue(list.searchKey(100));
	}
	
	 @Test
	    public void givenDelete40() {

	        LinkedList list = new LinkedList();

	        list.add(56);
	        list.add(30);
	        list.add(40);
	        list.add(70);

	        list.delete(40);

	     
	        assertEquals(56, list.head.data);
	        assertEquals(30, list.head.next.data);
	        assertEquals(70, list.head.next.next.data);
	        assertNull(list.head.next.next.next);

	        // Verify the size
	        assertEquals(3, list.size());
	    }
	
}
