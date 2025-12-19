package org.java_arrays_Easy;

public class RightRotateBr {
	public static void main(String[] args) {
		int nums[] = {1,2,3,4,5,6,7};
		int k = 3;
		 int n = nums.length;
	        int r = k%n;
	        int temp[] = new int[r];
	        for(int i=0;i<r;i++){
	            temp[i] = nums[i+(n-r)];
	        }
	     
	        for(int i=n-1;i>=r;i--){
	            nums[i] = nums[i-r];
	        }
	        
	        for(int i=0;i<r;i++) {
	            nums[i] = temp[i];
	        }
	        
	        for(int num : nums) {
	        	System.out.print(num+" ");
	        }
	        
	    
	}

}
