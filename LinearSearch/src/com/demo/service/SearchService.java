package com.demo.service;

import java.util.Scanner;

public class SearchService {
	public static void acceptData(int[] a, int n) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<n; i++) {
			System.out.println("Enter the "+(i+1)+" element: ");
			a[i] = sc.nextInt();
		}
	}
	
	public static int linearSearch(int[] a, int search) {
		for(int i=0; i<a.length; i++) {
			if(a[i] == search) {
				return i;
			}
		}
		return -1;
	}
}
