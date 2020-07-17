import easy.*;

import java.util.Arrays;

import static easy.TwoSum.twoSum;


public class TestMyCode{
    public static void main(String[] args){
        int[] nums = new int[]{2,7,15,4,2,3,5,11,9};
        int target = 9;
        int[] result = twoSum(nums, target);
        Arrays.stream(result).forEach(inte -> System.out.println(inte));
    }
}