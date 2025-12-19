public class SecondLargestO {
	public static void main(String[] args) {
		int arr[] = {1,2,4,7,7,5};
		int largest = arr[0]; int ScdLar = -1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				ScdLar = largest;
				largest = arr[i];
			}
			else {
				if(arr[i]!=largest && arr[i]>ScdLar) {
					ScdLar = arr[i];
				}
			}
		}
		System.out.println(ScdLar);
	}

}
