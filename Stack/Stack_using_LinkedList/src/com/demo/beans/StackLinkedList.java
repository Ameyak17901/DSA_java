package com.demo.beans;

public class StackLinkedList {
	Node top;
	class Node{
		int data;
		Node next;
		
		public Node(int d) {
			data = d;
			next = null;
		}
	}
	
	public StackLinkedList() {
		top = null;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public void push(int d) {
		Node newnode = new Node(d);
		if(top != null) {
			newnode.next = top;
		}
		top = newnode;
//		top = newnode;
	}
	
	public int pop() {
		if(isEmpty()) return -1;
//		else {
		Node temp = top;
//		int d = top.data;
		top = top.next;
		temp.next = null;
//		temp = null;
		return temp.data;
//		}
	}
	
	public void display() {
		Node temp = top;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}
