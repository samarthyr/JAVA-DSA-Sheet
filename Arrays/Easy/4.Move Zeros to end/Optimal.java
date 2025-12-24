package org.java_arrays_Easy;

public class MoveZeroEndOp {
	public static void main(String[] args) {
		
		int arr[] =  {1,0,2,3,2,0,0,4,5,1};
		
//		two pointer method
//		find the 1st zeroth elem 
		int j=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] ==0) {
				j=i;
				break;
			}
		}
		
//		start i from next to j
		for(int i=j+1;i<arr.length;i++) {
			if(arr[i]!=0) {
//				swaping j and i
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		
		for(int num:arr) {
			System.out.print(num + " ");
		}
	}

}
