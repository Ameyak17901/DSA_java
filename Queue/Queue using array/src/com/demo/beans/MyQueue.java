package com.demo.beans;

public class MyQueue {
	private int[] arr;
	private int size;
	private int front;
	private int rear;
	
	public MyQueue() {
		arr = new int[10];
		size = 10;
		front = -1;
		rear = -1;
	}
	
	public MyQueue(int size) {
		arr = new int[size];
		this.size = size;
		front = -1;
		rear = -1;
	}
	
	public boolean isFull() {
		return rear == size-1;
	}
	
	public boolean isEmpty() {
		return front == rear;
	}
	
	public boolean enqueue(int val) {
		if(!isFull()) {
			rear++;
			arr[rear] = val;
			return true;
		}
		else {
			System.out.println("Queue is full");
			return false;
		}
	}
	
	public int dequeue() {
		if(!isEmpty()) {
			return arr[++front];
		}
		return -1;
	}
}
