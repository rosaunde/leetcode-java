package medium;

public class LargestNumber {
    public String largestNumber(int[] nums) {
        String result = "";

        for(int i = 0; i < nums.length; i++){
            String maxNumber = "";
            int maxIndex = -1;
            for(int j = 0; j < nums.length; j++){
                String currentNumber = String.valueOf(nums[j]);
                if(currentNumber.equals("-1")){
                    continue;
                }
                if(maxNumber.equals("")){
                    maxNumber = currentNumber;
                    maxIndex = j;
                    continue;
                }
                if(isLargerThanMax(currentNumber, maxNumber)){
                    maxNumber = currentNumber;
                    maxIndex = j;
                }
            }
            result += maxNumber;
            nums[maxIndex] = -1;
        }
        if(result.charAt(0) == '0' && result.length() > 1){
            result = "0";
        }
        return result;
    }

    public boolean isLargerThanMax(String contender, String max){
        String contenderFirst = contender + max;
        String maxFirst = max + contender;
        return Long.parseLong(contenderFirst) > Long.parseLong(maxFirst);
    }
}