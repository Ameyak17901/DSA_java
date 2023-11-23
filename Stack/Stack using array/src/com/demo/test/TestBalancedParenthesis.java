package com.demo.test;

import com.demo.beans.MyStringStack;

public class TestBalancedParenthesis {

	public static void main(String[] args) {
		String s = "(({}))";
		boolean status = checkParenthesisBalanced(s);
		
		if(status) {
			System.out.println("parenthesis balanced");
		} else {
			System.out.println("parenthesis not balanced");
		}
	}

	private static boolean checkParenthesisBalanced(String s) {
		MyStringStack strst = new MyStringStack();
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch == '(' || ch == '{' || ch == '[') {
				strst.push(ch);
			}
			else {
				if(!strst.isEmpty()) {
					char ch1 = strst.pop();
					if(ch == ')' && ch1 != '(' || ch == '}' && ch1 != '{' || ch == ']' && ch1 != '[') {
						return false;
					}				
				} 
			}
			
		}
		return strst.isEmpty();
		
	}

}
