package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

import com.demo.service.SortingService;

public class TestInsertionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of elements: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		SortingService.acceptData(a, n);
		
		System.out.println("Given array: ");
		System.out.println(Arrays.toString(a));
		
		// selection sort
		SortingService.insertionSort(a);
		System.out.println("Sorted array: ");
		System.out.println(Arrays.toString(a));
		sc.close();
	}

}
