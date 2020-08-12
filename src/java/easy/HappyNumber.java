package easy;

import java.util.HashSet;
import java.util.Set;

class HappyNumber {
    public static boolean isHappy(int n) {
        Set<Integer> alreadySeen = new HashSet<>();
        while(alreadySeen.add(n)){
            int result = 0;
            while(n > 0){
                int digit = n %10;
                result += digit * digit;
                n /=10;
            }
            if(result == 1){
                return true;
            }
            n = result;
        }
        return false;
    }
}