package com.demo.test;

import java.util.Scanner;

import com.demo.service.SearchService;

public class TestLinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. elements: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		SearchService.acceptData(a, n);
		
		System.out.println("Enter the element to search: ");
		int search = sc.nextInt();
		int pos = SearchService.linearSearch(a, search);
		if(pos != -1) {
			System.out.println("Element found  at " + (pos+1) + " position");
		} else {
			System.out.println("Element not found");
		}
		
		sc.close();
	}

}
