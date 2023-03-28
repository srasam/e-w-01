package com.java.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
	public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        
        for(int i = 0; i < nums.length; i++) {
            
            int a = target - nums[i];
            
            if (!map.containsKey(a)) {
                map.put(nums[i], i);
            } else {
                int[] result = {map.get(a), i};
                for(int j=0;j<result.length;j++) {
                	System.out.println(result[j]);
                }
                return result;
            }
            
        }
        
        return null; 
    }

	public static void main(String[] args) {
		
	Main m=new Main();
	int a[]= {3,2,4};
	m.twoSum(a, 6);
	
	
	
	
	
		       
		    
	}

}
