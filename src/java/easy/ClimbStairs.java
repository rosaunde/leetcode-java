package easy;

import java.util.HashMap;

public class ClimbStairs {
    private HashMap<Integer, Integer> values = new HashMap<Integer,Integer>();
    public int climbStairs(int n) {
        values.put(1,1);
        values.put(2,2);

        return climbStairsRecursive(n);
    }

    public int climbStairsRecursive(int n) {
        if(values.get(n) != null){
            return values.get(n);
        }

        int value = climbStairsRecursive(n-1) + climbStairsRecursive(n-2);
        values.put(n, value);
        return value;
    }
}