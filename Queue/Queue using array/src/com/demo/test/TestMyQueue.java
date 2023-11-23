package com.demo.test;

import com.demo.beans.MyQueue;

public class TestMyQueue {

	public static void main(String[] args) {
		MyQueue q = new MyQueue(4);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		while(!q.isEmpty()) {
			System.out.println(q.dequeue());
		}
	}

}
