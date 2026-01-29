// Optimal:


public class ArrayMaximumSubarraySumOp {
	public static void main(String[] args) {
		int arr[] = {-2,-3,4,-1,-2,1,5,-3};
		int maxi = Integer.MIN_VALUE;
		Set<Integer> s = new HashSet<>();
		int sum = 0;
		int start = 0, ansSt=0, ansEd=0;
		for(int i=0;i<arr.length;i++) {
			if(sum==0) {
				start = i;
			}
			sum = sum + arr[i];
			if(sum>maxi) {
				maxi = sum;
				ansSt = start;
				ansEd = i;
			}
			else if(sum<0) {
				sum=0;
			}
		}
		for(int i=ansSt;i<=ansEd;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}