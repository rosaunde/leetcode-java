package util;

import java.util.Arrays;

public class MaxHeap {

    private int capacity;
    private int size = 0;
    private int[] values;

    public MaxHeap(int capacity){
        this.capacity = capacity;
        this.values = new int[capacity];
    }

    public MaxHeap(int[] arr){
        this.capacity = arr.length;
        this.size = arr.length;
        this.values = arr;
        buildMaxHeap(arr);
    }

    private void ensureExtraCapacity(){
        if(size == capacity) {
            Arrays.copyOf(values, capacity * 2);
            capacity *= 2;
        }
    }

    public int peek(){
        return values[0];
    }

    public int poll(){
        if(size==0){
            throw new IllegalStateException("Min Heap is empty");
        }
        int result = values[0];
        values[0] = values[size-1];
        size--;
        heapifyDown(0);
        return result;
    }

    private void buildMaxHeap(int[] arr){
        for(int i = arr.length-1; i >= 0; i--){
            heapifyDown(i);
        }
    }

    private void heapifyDown(int index){
        while(hasLeftNode(index)){
            if(!hasRightNode(index) && getLeftChildValue(index) > values[index]) {
                swap(index, getLeftNode(index));
                index = getLeftNode(index);
                continue;
            }
            int leftChildValue = getLeftChildValue(index);
            int rightChildValue = getRightChildValue(index);
            if(values[index] < Math.min(leftChildValue, rightChildValue)){
                if(leftChildValue>rightChildValue){
                    swap(index, getLeftNode(index));
                    index =getLeftNode(index);
                } else{
                    swap(index, getRightNode(index));
                    index=getRightNode(index);
                }
            } else if(values[index] < leftChildValue){
                swap(index, getLeftNode(index));
                index =getLeftNode(index);
            }  else if(values[index] < rightChildValue){
                swap(index, getRightNode(index));
                index =getRightNode(index);
            } else{
                break;
            }
        }

    }

    public void add(int value){
        ensureExtraCapacity();
        values[size] = value;
        size++;
        heapifyUp();
    }

    private void heapifyUp(){
        int index = size-1;
        while(hasParentNode(index) && getParentValue(index) < values[index]){
            int nextIndex = getParentNode(index);
            swap(index, nextIndex);
            index = nextIndex;
        }
    }

    private boolean isLeafNode(int index){
        if(hasLeftNode(index) || hasRightNode(index)){
            return false;
        }
        return true;
    }

    private void swap(int index1, int index2){
        values[index1] = values[index1]^values[index2];
        values[index2] = values[index1]^values[index2];
        values[index1] = values[index1]^values[index2];
    }

    private boolean hasParentNode(int index){
        return index!=0;
    }

    private int getParentNode(int index){
        if(!hasParentNode(index)){
            throw new IllegalStateException();
        }

        return (index-1)/2;
    }

    private int getParentValue(int index){
        if(!hasParentNode(index)){
            throw new IllegalStateException();
        }

        return values[getParentNode(index)];
    }

    private boolean hasRightNode(int index){
        if(index >= size){
            throw new IllegalStateException();
        }
        return (index*2)+2 < size;
    }

    private int getRightNode(int index){
        if(!hasRightNode(index)){
            throw new IllegalStateException();
        }

        return (index*2)+2;
    }

    private int getRightChildValue(int index){
        if(!hasRightNode(index)){
            throw new IllegalStateException();
        }

        return values[getRightNode(index)];
    }

    private boolean hasLeftNode(int index){
        if(index >= size){
            throw new IllegalStateException();
        }
        return (index*2)+1 < size;
    }

    private int getLeftNode(int index){
        if(!hasLeftNode(index)){
            throw new IllegalStateException();
        }

        return (index*2)+1;
    }

    private int getLeftChildValue(int index){
        if(!hasLeftNode(index)){
            throw new IllegalStateException();
        }

        return values[getLeftNode(index)];
    }


}
