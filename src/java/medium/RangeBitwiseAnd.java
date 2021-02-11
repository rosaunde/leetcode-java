package medium;

class RangeBitwiseAnd {
    public int rangeBitwiseAnd(int m, int n) {
        if(m<=n/2){
            return 0;
        }
        while(n>m){
            n&=n-1;
        }
        return n;
    }
}