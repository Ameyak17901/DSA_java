package com.demo.test;

import com.demo.beans.SinglyLinkedList;

public class TestSinglyList {

	public static void main(String[] args) {
		SinglyLinkedList s = new SinglyLinkedList();
		
		s.addAtEnd(12);
		s.addAtEnd(13);
		s.addAtPosition(11, 1);
		s.display();
		
		s.reverse();
		
		s.display();
		
		s.deleteAtEnd();
		s.deleteAtPosition(2);
		s.display();
		

	}

}
