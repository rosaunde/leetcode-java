package easy;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int length = 0;
        if(s.length() == 0){
            return 0;
        }
        boolean spaceBuffer = true;
        for(int i = s.length()-1; i >=0; i--){
            if(s.charAt(i) == ' ' && spaceBuffer == false){
                return length;
            } else if (s.charAt(i) != ' '){
                if(spaceBuffer == true){
                    spaceBuffer = false;
                }
                length++;
            }
        }
        return length;
    }
}