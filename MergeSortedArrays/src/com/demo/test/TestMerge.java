package com.demo.test;

import java.util.Arrays;

public class TestMerge {

	public static void main(String[] args) {
		int[] arr1 = {4,9,12,15,20};
		int[] arr2 = {1,2,3,14,21,45};
		int[] arr3 = new int[arr1.length + arr2.length];
		merge(arr1,arr2,arr3);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
	}

	private static void merge(int[] arr1, int[] arr2, int[] arr3) {
		int i=0, j=0, k=0;
		
		while(i < arr1.length && j < arr2.length) {
			
			// if arr1[i] is < arr2[j] then add arr1[i] in arr3
			if(arr1[i] < arr2[j]) {
				arr3[k] = arr1[i];
				k++;
				i++;
			}
			// else add arr2[j] in arr3
			else {
				arr3[k] = arr2[j];
				k++;
				j++;
			}
		}
		
		// in case arr2 is finished first
		while(i < arr1.length) {
			arr3[k] = arr1[i];
			k++;
			i++;
		}
		
		// in case arr1 is finished first
		while(j < arr2.length) {
			arr3[k] = arr2[j];
			k++;
			j++;
		}
	}

}
