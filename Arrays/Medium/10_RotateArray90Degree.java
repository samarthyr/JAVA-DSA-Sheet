// Optimal:

public class Rotate90DegreeOp {
	
	public static void main(String[] args) {
		int arr[][] = {{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12},
						{13,14,15,16}};
		int n = arr.length;
		System.out.println(n);
//		transpose the given matrix:
		for(int i=0;i<n-1;i++) {
			for(int j=i;j<n;j++){
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		System.out.println(Arrays.deepToString(arr));
//		reverse each row to get 90 degree matrix:
		for(int i=0;i<n;i++) {
			for(int j=0;j<n/2;j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[i][n-j-1];
				arr[i][n-j-1] = temp;
			}
		}
		
		System.out.println(Arrays.deepToString(arr));
	}

}
