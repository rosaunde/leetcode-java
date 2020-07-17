package easy;

public class CountAndSay {
    public static String countAndSay(int n) {
        if(n==1){
            return "1";
        }if(n==2){
            return "11";
        }
        String lastResult = countAndSay(n-1);
        int count = 1;
        StringBuilder result = new StringBuilder("");
        char lastChar = lastResult.charAt(0);
        for(int i = 1; i < lastResult.length(); i++){
            if(lastResult.charAt(i) == lastChar){
                count++;
            } else{
                result.append(count);
                result.append(lastChar);
                lastChar = lastResult.charAt(i);
                count = 1;
            }
        }
        result.append(count);
        result.append(lastChar);
        return result.toString();
    }
}