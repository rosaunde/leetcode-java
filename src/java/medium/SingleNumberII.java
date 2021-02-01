package medium;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberII {
    Map<Integer,Integer> map = new HashMap<>();
    public int singleNumber(int[] nums) {
        for(int i = 0 ; i < nums.length; i ++){
            int value = nums[i];
            if(map.containsKey(value)){
                map.put(value, map.get(value)+1);
            } else{
                map.put(value,1);
            }
        }
        int result=0;
        for(Map.Entry<Integer,Integer> set : map.entrySet()){
            if(set.getValue()==1){
                result=set.getKey();
            }
        }
        return result;
    }
}