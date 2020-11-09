package easy;

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        return binarySearch(1, n);
    }

    public int binarySearch(int l, int r){
        int m = l + (r-l) / 2;
        if(isBadVersion(m)){
            if(!isBadVersion(m-1)){
                return m;
            }
            return binarySearch(l, m-1);
        } else {
            return binarySearch(m+1,r);
        }
    }

    public boolean isBadVersion(int m){
        return m>35;
    }
}