package com.demo.test;

import com.demo.beans.DoublyLinkedList;

public class TestDoublyList {

	public static void main(String[] args) {
		DoublyLinkedList d = new DoublyLinkedList();
		
		d.addAtEnd(13);
		d.addAtEnd(14);
		d.addAtPosition(12, 1);
		d.addAtPosition(10, 2);
		
		d.display();
		
		d.deleteAtEnd();
		d.display();
		
		d.deleteAtPosition(1);
		d.display();
		
		

	}

}
