package easy;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        return increment(digits, digits.length-1);
    }

    public static int[] increment(int[] digits, int index){
        if(index == 0){
            if(digits[index] == 9){
                int[] newDigits = new int[digits.length+1];
                newDigits[0] = 1;
                for(int i = 1; i < digits.length; i++){
                    digits[i] = 0;
                }
                return newDigits;
            }
            else{
                digits[index] = digits[index] + 1;
                return digits;
            }
        } else{
            if(digits[index] == 9){
                digits[index] = 0;
                return increment(digits, index-1);
            } else{
                digits[index] = digits[index] + 1;
                return digits;
            }
        }

    }
}