package com.java.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Kth_Largest {
	
	public int findKthLargest(int[] nums, int k) {
		
        int result;
        Arrays.sort(nums);
        System.out.println("sorted array");
        for(int num: nums) {
        	System.out.println(num);
        }
       result= nums[k-1];
       System.out.println(result);
       return result;
        
    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		Kth_Largest k= new Kth_Largest();
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		k.findKthLargest(a,4);
	}

}
