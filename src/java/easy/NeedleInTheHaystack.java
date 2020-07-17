package easy;

public class NeedleInTheHaystack {
    public static int strStr(String haystack, String needle) {
        if(needle.equals("")){
            return 0;
        }
        return haystack.indexOf(needle);
    }
}