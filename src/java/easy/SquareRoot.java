package easy;

public class SquareRoot {
    public static int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        if(x<4){
            return 1;
        }
        long l = 0;
        long r = x;
        long mid = 0;
        while(r>l){
            mid = (l+r)/2;
            if(mid*mid == x){
                return (int) mid;
            }else if(mid*mid < x && (mid+1) * (mid+1) > x) {
                return (int) mid;
            } else if(mid*mid < x){
                l = mid + 1;
            }else{
                r = mid;
            }
        }
        return (int) mid;
    }
}