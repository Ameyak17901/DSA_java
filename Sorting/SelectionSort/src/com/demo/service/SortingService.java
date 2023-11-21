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

	public static void selectionSort(int[] a) {
		int n = a.length;
		for(int i=0; i<n-1; i++) {
			int min = i;
			for(int j=i+1; j<n; j++) {
				if(a[j] < a[min]) min = j;
			}
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
			System.out.println(Arrays.toString(a));
		}
		
	}

}
