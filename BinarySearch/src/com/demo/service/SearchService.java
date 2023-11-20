package com.demo.service;

import java.util.Scanner;

public class SearchService {

	// accepts input data from user
	public static void acceptData(int[] a, int n) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<n; i++) {
			System.out.println("Enter the element " + (i+1));
			a[i] = sc.nextInt();
		}
		
	}

	// binary search (non-recursive)
	public static int binarySearch(int[] a, int search) {
		int first = 0, last = a.length - 1;
		int searchcnt = 0;
		
		while(first < last) {
			int mid = (first + last) / 2;
			searchcnt++;
			if(a[mid] == search) {
				System.out.println("total searches : " + searchcnt);
				return mid;
			}
			else if(a[mid] < search) {
				first = mid + 1;
			} else {
				last = mid - 1;
			}
		}
		return -1;
		
	}
	
	// binary search (recursive)
	public static int binarySearchRecursive(int first, int last, int[] a, int search, int searchcnt) {
		
		
		if(first > last) {
			return -1;
		}
		else {
			int mid = (first + last ) / 2;
			
			if(a[mid] == search) {
				searchcnt++;
				System.out.println("total searches : " + searchcnt);
				return mid;
			} else if(a[mid] < search) {
				return binarySearchRecursive(mid + 1, last, a, search, ++searchcnt);
			} else {
				return binarySearchRecursive(first, mid - 1, a, search, ++searchcnt);
			}
		}
		
	}

}
