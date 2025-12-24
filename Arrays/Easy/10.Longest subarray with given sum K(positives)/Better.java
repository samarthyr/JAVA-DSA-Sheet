package org.java_arrays_Easy;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayBe {
	public static void main(String[] args) {
		int arr[] = {1,2,3,1,1,1,1,4,2,3};
		int k = 3;
		 HashMap<Integer, Integer> preSumMap = new HashMap<>();
		int sum = 0; int len = 0; int maxLen = 0;
		
		for(int i = 0;i<arr.length;i++) {
			sum += arr[i];
			if(sum == k) {
				maxLen = i+1;
			}
			long rem = sum - k;
			if(preSumMap.containsKey(rem)) {
				len = i - preSumMap.get(rem);
				maxLen = Math.max(maxLen, len);
			}
			if(!preSumMap.containsKey(sum)) {
				preSumMap.put(sum, i);
			}
		}
		
		System.out.println(maxLen);
	}

}
