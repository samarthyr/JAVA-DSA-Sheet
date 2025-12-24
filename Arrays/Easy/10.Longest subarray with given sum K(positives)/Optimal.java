package org.java_arrays_Easy;

public class LongestSubarrayOp {
	public static void main(String[] args) {
		int arr[] = {1,2,3,1,1,1,3,3};
		int k = 6;
		int left = 0; int right = 0;
		int sum = arr[0]; int maxLen = 0;
		int n = arr.length;
		while(right<n) {
//			check if the sum is greater and left dosnt cross right
			while(sum>k && left<=right) {
//				subtract left ele from the sum
				sum -= arr[left];
				left++;
			}
//			check if sum is equals to k
			if(sum == k) {
//				then update the maxLen with maximum length of subarray
				maxLen = Math.max(maxLen, right-left+1);
//				right-left fetches the length of the subarray.
			}
//			add previous elem
			right++;
//			if right is less then size
			if(right<n)
				sum += arr[right];
			
		}
//		return maxLen
		System.out.println(maxLen);
	}

}
