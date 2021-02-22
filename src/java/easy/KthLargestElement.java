package easy;

import java.util.Arrays;

public class KthLargestElement {
    int currentPos = 0;
    int size;
    int[] minHeap;
    public KthLargestElement(int k, int[] nums) {
        size = k;
        minHeap = new int[size];

        for(int num : nums){
            addToMinHeap(num);
        }
        System.out.println(Arrays.toString(minHeap));
    }

    private void addToMinHeap(int num){
        if(currentPos < size){
            minHeap[currentPos] = num;

            int child = currentPos;
            while(child > 0){
                int parent = (child-1)/2;
                if(minHeap[parent] > minHeap[child]){
                    swap(child, parent);
                }
                child = parent;
            }
            currentPos++;
        } else{
            if(num > minHeap[0]){
                minHeap[0] = num;
                heapifyDown(0);
            }
        }
    }

    private void heapifyDown(int index){
        if(hasLeftChild(index)){
            int minChildIndex = index*2+1;
            if(hasRightChild(index)){
                if(minHeap[minChildIndex] > minHeap[index*2+2]){
                    minChildIndex = index*2+2;
                }
            }

            if(minHeap[index] > minHeap[minChildIndex]){
                swap(index, minChildIndex);
                index = minChildIndex;
                heapifyDown(index);
            }
        }
    }

    private boolean hasLeftChild(int index){
        return (index * 2) + 1 < size;
    }

    private boolean hasRightChild(int index){
        return (index * 2) + 2 < size;
    }

    private void swap(int i1, int i2){
        minHeap[i1] = minHeap[i1]^minHeap[i2];
        minHeap[i2] = minHeap[i1]^minHeap[i2];
        minHeap[i1] = minHeap[i1]^minHeap[i2];
    }

    public int add(int val) {
        addToMinHeap(val);
        return minHeap[0];
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */