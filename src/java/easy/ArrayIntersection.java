package easy;

import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> values = new HashSet<>();
        for(int i = 0; i < nums1.length; i++){
            values.add(nums1[i]);
        }

        Set<Integer> overlap = new HashSet<>();
        for(int i = 0; i < nums2.length; i++){
            if(values.contains(nums2[i])){
                overlap.add(nums2[i]);
            }
        }

        int[] array = new int[overlap.size()];
        int i = 0;
        for(Integer element : overlap){
            array[i] = element;
            i++;
        }
        return array;
    }
}