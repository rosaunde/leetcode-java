package easy;

public class IsPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while(left<right){
            if(chars[left] != chars[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
