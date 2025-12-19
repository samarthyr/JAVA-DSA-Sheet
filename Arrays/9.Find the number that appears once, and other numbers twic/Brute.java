package org.java_arrays_Easy;
//Finding the element that accures once other elements occurs twice.


public class FindElementBr {
	public static void main(String[] args) {
		int arr[] = {1,1,2,3,3,4,4};
		
		for(int i=0;i<arr.length;i++) {
			int count = 0;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==i)
					count++;
			}
			if(count==1) System.out.println(i);
		}
	}

}
