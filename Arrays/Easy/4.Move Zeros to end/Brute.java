package org.java_arrays_Easy;

import java.util.*;

public class MoveZerosEndBr {
	public static void main(String[] args) {
		
		int arr[] = {1,0,2,3,2,0,0,4,5,1};
		
	
		List<Integer> temp = new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != 0) {
				temp.add(arr[i]);
			}	
		}
		
		for(int i=0;i<temp.size();i++) {
			arr[i] = temp.get(i);
		}
		int sizeofnonzero = temp.size();
		
		for(int i = sizeofnonzero;i<arr.length;i++) {
			arr[i] = 0;
		}
		
		for(int num:arr) {
			System.out.print(num+" ");
		}
		
		
	}

}
