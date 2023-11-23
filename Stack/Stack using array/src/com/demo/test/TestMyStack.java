package com.demo.test;

import com.demo.beans.MyStack;

public class TestMyStack {

	public static void main(String[] args) {
		MyStack st = new MyStack(3);
		st.push(9);
		st.push(7);
		st.push(12);
		st.push(10);
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}

	}

}
