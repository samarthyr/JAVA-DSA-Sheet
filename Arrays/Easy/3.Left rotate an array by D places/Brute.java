package org.java_arrays_Easy;

import java.util.ArrayList;
import java.util.List;

public class RotateArrayBr {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int n = arr.length;
		int d = 3%n;
		
		int temp[] = new int[d];
		
//		storing values to temp
		for(int i=0;i<d;i++) {
			temp[i] = arr[i];
		}
		
		
//		to rotate array
		for(int i=d;i<arr.length;i++) {
			arr[i-d] = arr[i];
		}
		
//		add temp ele from last 
		for(int i=n-d;i<n;i++) {
			arr[i] = temp[i-(n-d)];
		}
		
//		print array
		for(int num:arr) {
			System.out.print(num+" ");
		}
		
		
		
		
	}

}
