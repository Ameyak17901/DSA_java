package com.demo.service;

import java.util.Arrays;
import java.util.Scanner;

public class SortingService {

	public static void acceptData(int[] a, int n) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
	}

	public static void insertionSort(int[] a) {
		int n = a.length;
		for(int i=1; i<n; i++) {
			int j = i-1;
			int key = a[i];
			
			// shifting the element to left when a[j] > a[j+1] till j >= 0
			for(;j>=0 && a[j] > key;j--) {
				a[j+1] = a[j];
			}
			a[j+1] = key;
			
			System.out.println(Arrays.toString(a));
		}
		
	}

}
