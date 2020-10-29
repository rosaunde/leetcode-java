package easy;

public class IsUglyNumber {
    public boolean isUgly(int num) {
        if(num <= 0){
            return false;
        }
        if(num == 1){
            return true;
        }
        for(int i = 2; i <= 5; i++){
            while(num%i == 0){
                num/=i;
            }
        }
        if(num > 5){
            return false;
        }
        return true;
    }
}