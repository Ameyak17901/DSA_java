package com.demo.test;

import com.demo.beans.QueueLinkedList;

public class TestQueueList {

	public static void main(String[] args) {
		QueueLinkedList ob = new QueueLinkedList();
		
		ob.enqueue(12);
		ob.enqueue(13);
		ob.enqueue(78);
		ob.enqueue(45);
		
		ob.display();
		
		System.out.println(ob.dequeue());

		ob.display();
	}

}
