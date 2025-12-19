package org.java_arrays_Easy;
import java.util.*;
public class IntersectionOfArraysBr {
	public static void main(String[] args) {
		int a[] = {1,2,2,3,3,4,5,6};
		int b[] = {2,3,3,5,6,6,7};
		
		int visited[] = new int[b.length];
		
		List<Integer> ans = new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i] == b[j] && visited[j] == 0) {
					ans.add(a[i]);
					visited[j] = 1;
					break;
				}
				if(b[j]>a[i]) break;
			}
		}
		
		System.out.println(ans);
	}

}
