import java.util.*;

public class MergeArray{
    public static void main (String args[]){
        int arr1[] = {1,5,6,7,9};
        int arr2[] = {-3,7,15,16};
        int arr3[] = {11,13,17};

        List<Integer> l = new ArrayList<Integer>();
        int n1 = arr1.length;
        int n2 = arr2.length;
        int n3 = n1 + n2;
        int j = 0; int i = 0;

        while(i<n1){
            if(arr1[i]<arr2[j]){
               l.add(arr1[i]);
               i++;
            }
            else{
                l.add(arr2[j]);
                j++;
            }
        }
        System.out.print(l);
        
    }
}