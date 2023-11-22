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

	public static void mergeSort(int[] a,int start, int end) {
		if(start < end) {
			int mid = (start + end) / 2;
			mergeSort(a,start,mid);
			mergeSort(a,mid+1,end);
			merge(a,start,end,mid);
		}
		
	}

	public static void merge(int[] arr, int start, int end, int mid) {
		int i,j,k;
		int n1=mid-start+1; //size of left array
		int n2=end-mid;     //size of rigth array
		/*generate tempary array*/
		int[] leftarr=new int[n1];
		int[] rightarr=new int[n2];
		for(i=0;i<n1;i++) {
			leftarr[i]=arr[start+i];
		}
		for(i=0;i<n2;i++) {
			rightarr[i]=arr[mid+1+i];
		}
		i=0;
		j=0;
		k=start;
		
		while(i<n1 && j<n2) {
			if(leftarr[i]<rightarr[j]) {
				arr[k]=leftarr[i];
				i++;
				k++;
			}else {
				arr[k]=rightarr[j];
				j++;
				k++;
			}
		}
		while(i<n1) {
			arr[k]=leftarr[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]=rightarr[j];
			j++;
			k++;
		}
	}

}
