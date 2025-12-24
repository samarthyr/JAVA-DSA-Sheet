package org.java_arrays_Easy;

public class MissingNumberOp {
	public static void main(String[] args) {
		int[] arr = {1,2,4,5};
		int n = 5;
		
		int sum = n*(n+1)/2;
		int s2 =0;
		for(int i=0;i<arr.length;i++) {
			s2 += arr[i];
		}
		System.out.println((sum-s2));
	}

}
