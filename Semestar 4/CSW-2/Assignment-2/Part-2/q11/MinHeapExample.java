// MinHeapExample.java
import java.util.PriorityQueue;

class MinHeapExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 10, 8, 7, 3, 4, 6, 5, 9};
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for (int num : arr) {
            minHeap.add(num);
        }
        
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.remove());
        }
    }
}
