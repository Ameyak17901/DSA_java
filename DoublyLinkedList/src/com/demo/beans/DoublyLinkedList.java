package com.demo.beans;

public class DoublyLinkedList {
	private Node head;
	
	class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int d){
			data = d;
			next = null;
			prev = null;
		}
	}
	
	public DoublyLinkedList() {
		head = null;
	}
	
	public void addAtEnd(int data) {
		Node newnode = new Node(data);
		if(head == null) {
			head = newnode;
		}else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			
			temp.next = newnode;
			newnode.prev = temp;
		}
	}
	
	public void addAtPosition(int d, int pos) {
		Node newnode = new Node(d);
		if(head == null && pos == 1) {
			head = newnode;
		}else {
			if(pos == 1) {
				newnode.next = head;
				head.prev = newnode;
				head = newnode;
			}else {
				int p = 1;
				Node temp = head;
				while(temp != null) {
					if(p == pos - 1) {
						newnode.next = temp.next;
						newnode.prev = temp;
						temp.next.prev = newnode;
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
			System.out.println("List is empty");
		}else {
			Node prev = head;
			Node cur = prev.next;
			while(cur.next != null) {
				prev = cur;
				cur = cur.next;
			}
			prev.next = null;
			cur.prev = null;
			cur = null;
		}
	}
	
	public void deleteAtPosition(int pos) {
		if(head == null) {
			System.out.println("list is empty");
		}else {
			if(pos == 1) {
				Node temp = head;
				head = head.next;
				head.prev = null;
				temp.next = null;
				temp = null;
			}else {
				int p = 1;
				Node prev = head;
				Node cur = prev.next;
				while(cur.next != null) {
					if(p == pos - 1) {
						prev.next = cur.next;
						cur.next.prev = prev;
						break;
					}
					p++;
					prev = cur;
					cur = cur.next;
				}
			}
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
