package easy;

public class AddDigits {
    public int addDigits(int num) {
        if(num < 10){
            return num;
        }
        int result = 0;
        while(num >= 10){
            result += num %10;
            num/=10;
        }
        return addDigits(result + num);
    }
}