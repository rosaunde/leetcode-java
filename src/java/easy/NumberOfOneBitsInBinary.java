package easy;

public class NumberOfOneBitsInBinary {

    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        String value = Integer.toBinaryString(n);
        int count = 0;
        for(char c : value.toCharArray()){
            if(Character.getNumericValue(c) == 1){
                count++;
            }
        }
        return count;
    }
}