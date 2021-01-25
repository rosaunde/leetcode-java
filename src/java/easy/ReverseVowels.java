package easy;

public class ReverseVowels {
    public String reverseVowels(String s) {
        int leftPointer = 0;
        int rightPointer = s.length()-1;
        char[] chars = s.toCharArray();

        while(leftPointer<rightPointer){
            while(leftPointer <= rightPointer && !isVowel(chars[leftPointer])){
                leftPointer++;
            }
            while(leftPointer <= rightPointer && !isVowel(chars[rightPointer])){
                rightPointer--;
            }
            if(leftPointer<rightPointer){
                Character temp = chars[leftPointer];
                chars[leftPointer] = chars[rightPointer];
                chars[rightPointer] = temp;
                leftPointer++;
                rightPointer--;
            }
        }
        return new String(chars);
    }

    private boolean isVowel(Character character){
        return character == 'a' || character == 'A' ||
                character == 'e' || character == 'E' ||
                character == 'i' || character == 'I' ||
                character == 'o' || character == 'O' ||
                character == 'u' || character == 'U';
    }
}