package easy;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> results = new ArrayList<>();
        if(nums.length == 0){
            return results;
        }
        int index = 0;
        while(index <  nums.length){
            int value = nums[index];
            int currentValue = nums[index];
            while(index < nums.length -1 && nums[index+1] == currentValue+1){
                index++;
                currentValue++;
            }
            String result = String.valueOf(value);
            if(currentValue != value){
                result += "->" + String.valueOf(currentValue);
            }
            results.add(result);
            index++;
        }
        return results;
    }
}