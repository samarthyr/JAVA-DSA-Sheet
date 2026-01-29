// Optimal Solution:


public class MajorityEleOp {
	public static void main(String[] args) {
		int arr[] = {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
		int cnt=0, ele =0;
		int n = arr.length;
		for(int i=0;i<n;i++) {
			if(cnt==0) {
				cnt++;
				ele=arr[i];
			}
			else if(ele==arr[i]) {
				cnt++;
			}
			else {
				cnt--;
			}
		}
		int cnt1=0;
		for(int i=0;i<n;i++) {
			if(ele==arr[i]) cnt1++;
		}
		if(cnt1>(n/2)) System.out.println(ele);
	}

}
// this is solved by using Mooe`s Algorithm.