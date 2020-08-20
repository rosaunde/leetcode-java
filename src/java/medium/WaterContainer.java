package medium;

class WaterContainer {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while(left < right){
            int leftHeight = height[left];
            int rightHeight = height[right];
            int area = (right - left) * Math.min(leftHeight, rightHeight);
            if(area > maxArea){
                maxArea = area;
            }
            if(leftHeight < rightHeight){
                while(height[left] <= leftHeight && left < right){
                    left++;
                }
            } else {
                while(height[right] <= rightHeight && left < right){
                    right--;
                }
            }
        }
        return maxArea;
    }
}