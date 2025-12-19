package org.java_arrays_Easy;

public class LargestElement {
	public static void main(String[] args) {
		int arr[] = {232,2,34,32,2,11};
		
		int largest = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest = arr[i];
			}
		}
		System.out.println(largest);
	}

}
