package org.java_arrays_Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

//Time Complexity = O(n * m), Space Complexity = O(n * m)

public class SpiralArrayOp {
	public static void main(String[] args) {
		int arr[][] = {{1,2,3,4,5},
				{7,8,9,10,11},
				{13,14,15,16,17},
				{19,20,21,22,23},
				{24,25,26,27,28}};
		
		int n = arr.length;  // number of rows
		int m = arr[0].length; // number of columns
		int top = 0, right = m-1, left = 0, bottom = n-1;
		
		List<Integer> v = new ArrayList<>();
		
		while(top<=bottom && left<=right) {
			
			// Traverse from left to right along the top row
			for(int i=left;i<=right;i++) {
				v.add(arr[top][i]);
			}
			top++; // Move the top boundary down
			
			 // Traverse from top to bottom along the right column
			for(int i=top;i<=bottom;i++) {
				v.add(arr[i][right]);
			}
			right--; // Move the right boundary left
			
			// Traverse from right to left along the bottom row, if there are remaining rows
			if(top<=bottom) {
				for(int i=right;i>=left;i--) {
					v.add(arr[bottom][i]);
				}
				bottom--; // Move the bottom boundary up
			}
			
			// Traverse from bottom to top along the left column, if there are remaining columns
			for(int i=bottom;i>=top;i--) {
				v.add(arr[i][left]);
			}
			left++; // Move the left boundary right
		}
		System.out.println(v);
	}

}
