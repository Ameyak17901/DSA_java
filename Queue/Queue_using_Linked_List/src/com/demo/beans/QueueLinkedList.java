package com.demo.beans;

public class QueueLinkedList {
	Node front, rear;
	
	class Node{
		int data;
		Node next;
		
		public Node(int d) {
			data = d;
			next = null;
		}
	}
	
	public QueueLinkedList() {
		front = null;
		rear = null;
	}
	
	public boolean isEmpty() {
		return front == null && rear == null;
	}
	
	public void enqueue(int d) {
		Node newnode = new Node(d);
		
		if(isEmpty()) {
			front = newnode;
			rear = newnode;
		}else {
			rear.next = newnode;
			rear = newnode;
		}
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("queue is empty");
			return -1;
		}else {
			if(front == rear) {
				int d = front.data;
				front = null;
				rear = null;
				return d;
			}
			else{
				int d = front.data;
				front = front.next;
				return d;
			}
		}
	}
	
	public void display() {
		Node temp = front;
		while(temp != rear) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.print(temp.data);
		System.out.println();
	}
}
