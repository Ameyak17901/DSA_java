package com.demo.service;

public class NumberService {
	public static int factorialRecursive(int n) {
		if(n == 0) {
			return 1;
		}
		else if(n == 1) {
			return 1;
		} else {
			return n * factorialRecursive(n-1);
		}
	}
}
