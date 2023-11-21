package com.demo.service;

import java.util.Arrays;
import java.util.Scanner;

public class SortingService {
	
	// accepts data from user
	public static void acceptData(int[] a, int n) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
	}

	public static void bubbleSort(int[] a) {
		int n = a.length;
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-1-i; j++) {
				if(a[j+1] < a[j]) {
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
					
				}
				System.out.println(Arrays.toString(a));
			}
			
			
		}
		
	}

	// modified bubble sort
	public static void improvisedBubbleSort(int[] a) {
		int n = a.length;
		for(int i=0; i<n-1; i++) {
			boolean flag = false;
			for(int j=0; j<n-1-i; j++) {
				
				if(a[j+1] < a[j]) {
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
					flag = true;
					
				}
			}
			if(!flag) {
				break;
			}
			System.out.println(Arrays.toString(a));
			
		}
		
	}
	
}
