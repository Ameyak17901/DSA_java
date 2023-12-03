package com.demo.test;

import com.demo.beans.StackLinkedList;

public class TestStackList {

	public static void main(String[] args) {
		StackLinkedList s = new StackLinkedList();
		
		s.push(14);
		s.push(13);
		s.push(12);
		
		s.display();
		while(!s.isEmpty()) {
			System.out.print(s.pop() + " ");
		}
		
	}

}
