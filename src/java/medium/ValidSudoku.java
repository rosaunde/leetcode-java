package medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        List<HashSet<Character>> verticalLines = new ArrayList<HashSet<Character>>();
        List<HashSet<Character>> boxes = new ArrayList<HashSet<Character>>();

        for(int i = 0; i < 9; i++){
            verticalLines.add(new HashSet<Character>());
            boxes.add(new HashSet<Character>());
        }

        for(int i = 0; i < 9; i++){
            Set<Character> horizontalLine = new HashSet<>();
            for(int j = 0; j < 9; j++){
                Character atIndex = board[i][j];
                if(atIndex == '.'){
                    continue;
                }
                if(horizontalLine.contains(atIndex)){
                    return false;
                }
                horizontalLine.add(atIndex);

                if(verticalLines.get(j).contains(atIndex)){
                    return false;
                }
                verticalLines.get(j).add(atIndex);

                int box = (i/3) + ((j/3)*3);

                if(boxes.get(box).contains(atIndex)){
                    return false;
                }
                boxes.get(box).add(atIndex);

            }
        }
        return true;
    }
}