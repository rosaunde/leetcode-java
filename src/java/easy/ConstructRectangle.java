package easy;

public class ConstructRectangle {
    public int[] constructRectangle(int area) {
        int[] results = new int[2];
        int diff = Integer.MAX_VALUE;
        for(int i = (int) Math.sqrt(area); i > 0; i--){
            int width = i;
            int length = area/i;
            if(area%i == 0 && length >= width){
                if(length - width < diff){
                    diff = length - width;
                    results = new int[]{length, width};
                }
            }
        }
        return results;
    }
}