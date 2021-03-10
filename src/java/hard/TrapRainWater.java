package hard;

public class TrapRainWater {
    public int trap(int[] height) {
        int totalWater = 0;
        int left = 0;
        int right = height.length-1;
        int leftMax = 0;
        int rightMax = 0;
        while(left<=right){
            if(leftMax <= rightMax){
                if(height[left] < leftMax){
                    totalWater = totalWater + (leftMax-height[left]);
                } else if(height[left] > leftMax){
                    leftMax = height[left];
                }
                left++;
            } else{
                if(height[right] < rightMax){
                    totalWater = totalWater + (rightMax-height[right]);
                } else if(height[right] > rightMax){
                    rightMax = height[right];
                }
                right--;
            }
        }
        return totalWater;
    }
}