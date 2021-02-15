package sorting;

import util.MaxHeap;

public class HeapSort {

    public static void heapSort(int[] nums){
        MaxHeap heap = new MaxHeap(nums);
        for(int i = 0; i < nums.length-1; i++){
            heap.poll();
        }
    }
}
