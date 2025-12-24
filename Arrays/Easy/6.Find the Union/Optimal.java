package org.java_arrays_Easy;
import java.util.*;

public class UnionOfArraysOp {
	public static void main(String[] args) {
		
		int arr1[] = {1,1,2,3,4,5};
		int arr2[] = {1,2,3,4,4,5,6};
		List<Integer> union = new ArrayList<Integer>();
		
		int i =0;
		int j =0;
//		two pointer method i is for arr1 and j is for arr2
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<=arr2[j]) {
				if(union.size()==0 || union.get(union.size()-1)!=arr1[i]) {
					union.add(arr1[i]);
				}
				i++;	
			}
			else {
				if(union.size()==0 || union.get(union.size()-1)!=arr2[j]) {
					union.add(arr2[j]);
				}
				j++;
			}
		}
		
		while(j<arr2.length) {
			if(union.size()==0 || union.get(union.size()-1)!=arr2[j]) {
				union.add(arr2[j]);
			}
			j++;
		}
		
		while(i<arr1.length) {
			if(union.size()==0 || union.get(union.size()-1)!=arr1[i]) {
				union.add(arr1[i]);
			}
			i++;
		}
		
		System.out.println(union);
	}

}
