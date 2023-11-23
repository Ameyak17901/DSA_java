package com.demo.beans;

public class MyStringStack {
	private char[] arr;
	private int size;
	private int top;
	
	// default constructor
	public MyStringStack() {
		// default size of the stack
		arr = new char[10];
		size = 10;
		// initially top will be -1 --> notifying stack is empty
		top = -1;
	}
	
	// parameterized constructor 
	public MyStringStack(int size) {
		// size is received from user
		arr = new char[size];
		this.size = size;
		// initially top will be -1 --> notifying stack is empty
		top = -1;
	}

	// checks whether the stack is full or not
	public boolean isFull() {
		return top == size-1;
	}
	
	// checks whether stack is empty or not
	public boolean isEmpty() {
		return top == -1;
	}
	
	// adds new value at end until size is not reached
	public boolean push(char val) {
		if(!isFull()) {
			arr[++top] = val;
			return true;
		}
		// if stack is full display message "stack overflow" 
		else {
			System.out.println("stack overflow");
			return false;
		}
	}
	
	// removes value at end until stack is not empty
	public char pop() {
		// checks whether stack is empty or not
		if(!isEmpty()) {
			return arr[top--];
		}
		// if empty display "stack underflow"
		else {
			System.out.println("stack underflow");
			return '*';
		}
	}
}
