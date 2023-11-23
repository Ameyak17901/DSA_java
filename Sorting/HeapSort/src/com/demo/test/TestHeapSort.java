package com.demo.test;

import java.util.Arrays;

public class TestHeapSort {

	public static void main(String[] args) {
		int[] arr = {12,14,34,56,2,7,4}; 
		System.out.println("Given array: ");
		System.out.println(Arrays.toString(arr));
		
		// heap sort
		heapSort(arr);
		
		System.out.println("Sorted array: ");
		System.out.println(Arrays.toString(arr));

	}
	
	public static void heapSort(int[] arr) {
		int n = arr.length;
		// i represents the root of last subtree
		for(int i=n/2 - 1; i>=0; i--) {
			// converts the heap to max heap
			heapify(arr,n,i);
		}
		System.out.println(Arrays.toString(arr));
		
		// swaps the first and last element and consider the last element
		// as sorted
		for(int i=0; i<n; i++) {
			int temp = arr[0];
			arr[0] = arr[n-1-i];
			arr[n-1-i] = temp;
			
			// converts heap to max heap as swapping has disturb the 
			// heap
			System.out.println(Arrays.toString(arr));
			heapify(arr,n-1-i,0);
		}
	}

	public static void heapify(int[] arr, int n, int i) {
		int largest = i;
		int l = 2*i+1;
		int r = 2*i+2;
		
		// finds out the index of max element in subtree
		if(l < n && arr[largest] < arr[l]) {
			largest = l;
		}
		if(r < n && arr[largest] < arr[r]) {
			largest = r;
		}
		// checks whether the heap is already a max heap
		// if index of largest element is same as root ignore it 
		if(i != largest) {
			int temp = arr[largest];
			arr[largest] = arr[i];
			arr[i] = temp;
			// on converting to max heap converts the subtree with 
			// root index of largest element to max heap 
			heapify(arr,n,largest);
		}
	}

}
