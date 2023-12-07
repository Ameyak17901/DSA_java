package com.demo.beans;

public class Queue {
	class Node{
		Employee data;
		Node next;
		public Node(Employee e) {
			data = e;
			next = null;
		}
	}
	
	Node front,rear;
	
	public Queue() {
		front = null;
		rear = null;
	}
	
	public boolean isEmpty() {
		return front == null && rear == null; 
	}
	
	public void enqueue(Employee e) {
		Node newnode = new Node(e);
		if(isEmpty()) {
			front = newnode;
			rear = newnode;
		}else {
			rear.next = newnode;
			rear = newnode;
		}
	}
	
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("queue is empty");
		}else {
			Node temp = front;
			front = front.next;
			temp.next = null;
			System.out.println(temp.data);
		}
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("queue is empty");
		}else {
			Node temp = front;
			while(temp != rear) {
				System.out.println(temp.data);
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}
	
	public void search(String g) {
		if(isEmpty()) {
			System.out.println("queue is empty");
		}else {
			Node temp = front;
			while(temp != null) {
				if(temp.data.getGender().equals("male")) {
					System.out.println(temp.data);
				}
				temp = temp.next; 
			}
		}
	}
	
	public void emptyQueue() {
		if(front != null) {
			System.out.println(front.data);
			dequeue();
			emptyQueue();
		}
		
	}

	public void reversePrint() {
		Node temp = front;
		reverse(temp);
	}

	private void reverse(Node temp) {
		// TODO Auto-generated method stub
		if(temp.next == null) {
			System.out.println(temp.data);
			return;
		}
		reverse(temp.next);
		
	}
}
