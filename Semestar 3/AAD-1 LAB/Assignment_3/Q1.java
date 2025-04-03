
import java.util.Arrays;
public class Q1 {
    public static void bubbleSort(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n-1;i++) {
            for (int j=0;j<n-i-1;j++) {
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j + 1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64,34,25,12,22,11,90};
        System.out.println("Original array: " + Arrays.toString(arr));
        
        bubbleSort(arr);
        
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

/*
Output : 
Original array: [64, 34, 25, 12, 22, 11, 90]
Sorted array: [11, 12, 22, 25, 34, 64, 90]


Time Complexity : 
Worst Case: O(n²)
Best Case: O(n) (if the array is already sorted)
Average Case: O(n²)

Spcae Complexity : O(1)*/
