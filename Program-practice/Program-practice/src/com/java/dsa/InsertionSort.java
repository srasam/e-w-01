package com.java.dsa;

public class InsertionSort {
	public static void insertionSort(int[] data) {
		int n=data.length;
		for(int k=1;k<n;k++) {
			int cur=data[k];
			int j=k;
			while(j>0 && data[j-1]>cur) {
				data[j]=data[j-1];
				j--;
			}
			data[j]=cur;
		}
		
	}
	public static void insertionSortIncreasing(int[] data) {
		int n=data.length;
		for(int k=1;k<n;k++) {
			int cur=data[k];
			int j=k;
			while(j>0 && data[j-1]<cur) {
				data[j]=data[j-1];
				j++;
			}
			data[j]=cur;
		}
		
	}
	static void printArr(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			}
	}
	public static void main(String[] args) {
		int arr[]={1,2,5,6,4,7,8};
		insertionSort(arr);
		insertionSortIncreasing(arr);
		printArr(arr);
	}

}
