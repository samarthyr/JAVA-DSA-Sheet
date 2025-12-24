package org.java_arrays_Easy;
import java.util.*;

public class IntersectionOfArraysOp {
		public static void main(String[] args) {
			int a[] = {1,2,2,3,3,4,5,6};
			int b[] = {2,3,3,5,6,6,7};
			
			List<Integer> ans = new ArrayList<Integer>();
			
			int i=0;
			int j=0;
			
		   while(i<a.length && j<b.length) {
			   if(a[i]<b[j]) {
				   i++;
			   }
			   else if(b[j]<a[i]) {
				   j++;
			   }
			   else {
				   ans.add(a[i]);
				   i++;
				   j++;
			   }
			   
		   }
		   System.out.println(ans);
		}

}
