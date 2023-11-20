package com.demo.test;

import java.util.Scanner;

import com.demo.service.NumberService;

public class TestRecursiveFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int fact = NumberService.factorialRecursive(n);
		System.out.println("factorial of " + n + " is " + fact );
		sc.close();
	}

}
