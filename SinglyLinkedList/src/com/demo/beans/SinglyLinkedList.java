package com.demo.beans;

public class SinglyLinkedList {
	private Node head;
	
	class Node{
		int data;
		Node next;
		public Node(int d) {
			data = d;
			next = null;
		}
	}
	
	public SinglyLinkedList() {
		head = null;
	}
	
	public void addAtEnd(int d) {
		Node newnode = new Node(d);
		if(head == null) {
			head = newnode;
		}else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newnode;
		}
	}
	
	public void addAtPosition(int d, int pos) {
		Node newnode = new Node(d);
		if(head == null) {
			head = newnode;
		}else {
			if(pos == 1) {
				newnode.next = head;
				head = newnode;
			}else {
				int p = 1;
				Node temp = head;
				while(temp != null) {
					if(pos-1 == p) {
						newnode.next = temp.next;
						temp.next = newnode;
						break;
					}
					p++;
					temp = temp.next;
				}
			}
		}
	}
	
	public void deleteAtEnd() {
		if(head == null) {
			System.out.println("list is empty");
		}else {
			Node prev = head;
			Node cur = prev;
			while(cur.next != null) {
				prev = cur;
				cur = cur.next;
			}
			prev.next = null;
			
		}
	}
	
	public void deleteAtPosition(int pos) {
		if(head == null) {
			System.out.println("list is empty");
		}else {
			if(pos == 1) {
				Node temp = head;
				head = head.next;
				temp.next = null;
			}else {
				int p = 1;
				Node temp = head;
				while(temp != null) {
					if(p == pos - 1) {
						temp.next = temp.next.next;
						break;
					}
					temp = temp.next;
				}
			}
		}
	}
	
	public void reverse() {
		
		if(head == null) {
			System.out.println("list is empty");
		}else {
			Node cur = head;
			Node prev = null;
			Node next = null;
			
			while(cur != null) {
				next = cur.next;
				cur.next = prev;
				prev = cur;
				cur = next;
			}
			head = prev;
		}
	}
	
	public void display() {
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
}
