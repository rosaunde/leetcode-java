package medium;

public class UniqueBinarySearchTreesII {
    public int numTrees(int n) {
        return generateTrees(1,n);
    }
    public int generateTrees(int low, int high){
        if(high < low){
            return 0;
        }
        if(high - low == 0){
            return 1;
        }
        if(high - low == 1){
            return 2;
        }
        int result = 0;

        for(int i = low; i <= high; i++){
            int leftPoss = generateTrees(low, i-1);
            int rightPoss = generateTrees(i+1, high);
            if(leftPoss == 0){
                result+= rightPoss;
            } else if(rightPoss == 0){
                result += leftPoss;
            } else{
                result += leftPoss * rightPoss;
            }
        }

        return result;
    }
}