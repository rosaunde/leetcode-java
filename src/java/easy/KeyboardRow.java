package easy;

import java.util.ArrayList;
import java.util.HashMap;

public class KeyboardRow {
    public String[] findWords (String[] words) {
        HashMap<Character, Integer> map = new HashMap ();
        char row1 [] = {'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P'};
        char row2 [] = {'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L'};
        char row3 [] = {'Z', 'X', 'C', 'V', 'B', 'N', 'M'};
        for (char c : row1) {
            map.put (c, 1);
            map.put (Character.toLowerCase (c), 1);
        }
        for (char c : row2) {
            map.put (c, 2);
            map.put (Character.toLowerCase (c), 2);
        }
        for (char c : row3) {
            map.put (c, 3);
            map.put (Character.toLowerCase (c), 3);
        }
        ArrayList<String> res = new ArrayList ();
        for (int i = 0; i < words.length; i++) {
            String word = words [i];
            if (word.equals("")) {
                res.add (word);
                continue;
            }
            int row = (int) map.get (word.charAt (0));
            boolean flag = true;
            for (char c : word.toCharArray ()) {
                if ((int) map.get (c) != row) {
                    flag = false;
                    break;
                }
            }
            if (flag == true)
                res.add (word);
        }
        String arr [] = new String [res.size ()];
        for (int i = 0; i < res.size (); i++)
            arr [i] = res.get (i);
        return arr;
    }
}