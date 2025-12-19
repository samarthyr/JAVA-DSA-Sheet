package org.java_arrays_Easy;

import java.util.HashSet;
import java.util.Set;

public class UnionOfArraysBr {
	public static void main(String[] args) {
		int arr1[] = {1,1,2,3,4,5};
		int arr2[] = {2,3,4,4,5,6};
		
		Set<Integer> st = new HashSet<>();
		
		for(int i=0;i<arr1.length;i++) {
			st.add(arr1[i]);
		}
		
		for(int i=0;i<arr2.length;i++) {
			st.add(arr2[i]);
		}
		
		System.out.println(st);
	}

}
