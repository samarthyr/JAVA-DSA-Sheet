
public class SecondLargestBr {
	public static void main(String[] args) {
		int arr[] = {1,2,4,7,7,5};
		int largest = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest = arr[i];
			}
		}
		
		int Sndlar = -1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>Sndlar && arr[i]!=largest) {
				Sndlar = arr[i];
			}
		}
		System.out.println(Sndlar);
	}
	

}
